package com.dba.database;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;



public class client {
    //first we get the file with a file object
    static File file = new File("/Users/yabseragebrekidan/Developer/database/Database Client.xlsx");
    //then we read the entire file using the file input stream object
    FileInputStream xlsxFile = new FileInputStream(file);
    //Now we need to get our workbook using the workbook object, and then next line after workbook will be reading the sheet itself
    XSSFWorkbook workbook = new XSSFWorkbook(xlsxFile);
    XSSFSheet sheet = workbook.getSheetAt(0);
    int rowCount = sheet.getPhysicalNumberOfRows(); //12
    public client() throws IOException {

    }

    /* ------- CREATE operation (WRITE) ------- */
    public void createEntry(String[] entryInfo) throws Exception {
        Row row = sheet.createRow(rowCount);
        for(int i = 0; i < entryInfo.length; i++) {
            XSSFCell cell = (XSSFCell) row.createCell(i);
            cell.setCellValue(entryInfo[i]);
        }
        //Output location
        FileOutputStream outputStream = new FileOutputStream("/Users/yabseragebrekidan/Developer/database/output.xlsx");
        workbook.write(outputStream);
    }

    /* --------- READ operation ---------- */
    public void readFrom() throws Exception {
        for (int i = 0; i < rowCount; i ++) {
            XSSFRow row = sheet.getRow(i);
            int cellCount = row.getPhysicalNumberOfCells(); //15
            //XSSFCell cell = row.getCell(i);
            for (int j = 0; j < cellCount; j++) {
                XSSFCell cell = row.getCell(j);
                String cellValue = getCellValue(cell);
                System.out.print("||" + cellValue);
            }
            System.out.println();
        }
        workbook.close();
    }
    //Method to translate numeric values to string values
    public static String getCellValue(XSSFCell cell) {
        return switch (cell.getCellType()) {
            case NUMERIC -> String.valueOf(cell.getNumericCellValue());
            default -> cell.getStringCellValue();
        };
    }
    /* --------- UPDATE operation ---------- */
    public static void updateCell() {

    }

    /* --------- DELETE operation ---------- */
    public static void deleteCell() {

    }
}
