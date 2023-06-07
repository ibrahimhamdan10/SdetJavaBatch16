package class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class write {
    public static void main(String[] args) throws IOException {

//1)Software 2) Path 3) Store the file
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        XSSFSheet sheet = xssfWorkbook.createSheet("Sheet1");
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        Cell cell1 = row.createCell(1);
        Cell cell2 = row.createCell(2);
        cell.setCellValue("khaled");
        cell1.setCellValue("ghada");
        cell2.setCellValue("ibrahim");
        // used when we have to create a new file OR we write data to a file
        FileOutputStream fileOutputStream = new
        FileOutputStream(System.getProperty("user.dir") + "\\Files\\TestExcelFIle.xlsx");
        xssfWorkbook.write(fileOutputStream);


    }
}

