package com.dba.database;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.w3c.dom.Node;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SearchEngine {
    static File file = new File("/Users/yabseragebrekidan/Developer/database/Database Client.xlsx");
    FileInputStream xlsxFile = new FileInputStream(file);
    //Now we need to get our workbook using the workbook object, and then next line after workbook will be reading the sheet itself
    XSSFWorkbook workbook = new XSSFWorkbook(xlsxFile);
    XSSFSheet sheet = workbook.getSheetAt(0);
    int rowCount = sheet.getPhysicalNumberOfRows(); //12
    //XSSFRow row = sheet.getRow();
    int data;
    public Node root;
    public Node left;
    public Node right;
    public SearchEngine(int data) throws IOException {
        this.left = null;
        this.right = null;
        this.data = data;
    }


}
