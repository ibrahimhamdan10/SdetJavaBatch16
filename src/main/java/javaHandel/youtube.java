package javaHandel;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class youtube {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\ibrah\\IdeaProjects\\SDETjavaBatch16\\Files\\family.xlsx");
        try {
            XSSFWorkbook xwb = new XSSFWorkbook(file);
            XSSFSheet mySheet = xwb.getSheet("sheet1");
            int rowCount =mySheet.getPhysicalNumberOfRows();
            int columnCount = mySheet.getRow(0).getPhysicalNumberOfCells();
            for (int i = 0; i < rowCount ; i++) {
                for (int j = 0; j <columnCount ; j++) {
                    System.out.println(mySheet.getRow(i).getCell(j).getStringCellValue()+" ");
                }
            }
            System.out.println();
        }
                catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (InvalidFormatException e) {
                    throw new RuntimeException(e);
                }


    }
}
