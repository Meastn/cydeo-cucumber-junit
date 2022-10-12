package com.cydeo.tests;

import com.cydeo.pages.VyTrackDashboard;
import com.cydeo.pages.VyTrackLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

public class VYTrackDDTTest {

    VyTrackDashboard vyDashboard = new VyTrackDashboard();
    VyTrackLoginPage vyLogin = new VyTrackLoginPage();

    @Before
    public void setup() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
    }

    @After
    public void tearDown() {
        Driver.closeDriver();
    }


    @Test
    public void vyLoginDDTTest() throws IOException {
        String filepath = "VyTrackQa2Users.xlsx";
        FileInputStream in = new FileInputStream(filepath);
        XSSFWorkbook workbook = new XSSFWorkbook(in);
        XSSFSheet sheet = workbook.getSheet("data");

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            String usernameVY = sheet.getRow(i).getCell(0).toString();
            String passwordVY = sheet.getRow(i).getCell(1).toString();
            String firstname = sheet.getRow(i).getCell(2).toString();
            String lastname = sheet.getRow(i).getCell(3).toString();
            vyLogin.loginToVY(usernameVY, passwordVY);
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7));
            WebElement loaderMask = Driver.getDriver().findElement(By.cssSelector("div[class='loader-mask shown']"));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));

            String actualFullName = vyDashboard.fullName.getText();

            XSSFCell resultCell = sheet.getRow(i).getCell(4);

            if (actualFullName.contains(firstname) && actualFullName.contains(lastname)) {
                System.out.println("PASS");
                resultCell.setCellValue("PASS");
            } else {
                System.out.println("FAIL");
                resultCell.setCellValue("FAIL");
            }
            vyDashboard.logout();


        }

        FileOutputStream out = new FileOutputStream(filepath);
        workbook.write(out);

//        // in.close();
//        // out.close();
//        //workbook.close();

    }
}
