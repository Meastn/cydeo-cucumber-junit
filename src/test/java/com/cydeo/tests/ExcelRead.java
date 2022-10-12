package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelRead {
    String path = "SampleData.xlsx";
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    FileInputStream fileInputStream;

    @Test
    public void read_from_Excel_file() throws IOException {

        // to read from excel we first have to load it into FileInputStream
        fileInputStream = new FileInputStream(path);

        // Create a workbook object
        workbook = new XSSFWorkbook(fileInputStream);
        // Get the specific sheet your data is in
        sheet = workbook.getSheet("Employees");

        // select row and cell
        System.out.println(sheet.getRow(1).getCell(0));
        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println(sheet.getLastRowNum());

        // Create a logic to print a certain name within a sheet
        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Vinod")) {
                System.out.println(sheet.getRow(rowNum).getCell(0));
            }
        }
        // Create a logic that reaches JobID using the name

        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Linda")) {
                System.out.println(sheet.getRow(rowNum).getCell(2));
            }
        }
    }

}
