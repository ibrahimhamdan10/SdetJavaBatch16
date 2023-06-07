package class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class e3 {
    public static void main(String[] args) throws IOException {
        String path="Files/TestExcelFIle.xlsx";
        //we use FileInputStream to read the existing data
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        Row row=sheet.createRow(5);
        row.createCell(0).setCellValue("palestine");
        row.createCell(1).setCellValue("hamdan");
        row.createCell(2).setCellValue("omar");
        //creates an empty File
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        // data is written to that file.
        xssfWorkbook.write(fileOutputStream);
    }
}
