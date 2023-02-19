package Selenium;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceldata {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Desktop\\demo excel.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);

       //XSSFSheet sheet =  workbook.getSheet("data");
        //XSSFRow row = sheet.getRow(1);
        //XSSFCell cell =row.getCell(1);
        //String data = cell.getStringCellValue();
        //System.out.println(data);

       //short cut OR direct one line excel reading

       // String data = workbook.getSheet("data").getRow(1).getCell(0).getStringCellValue();
        //System.out.println(data);

        //for loop to read multiple data in excel
        //NOTE = ALWAYS SAVE THE EXCEL FILE AFTER UPDATING

      //  for(int i = 0; i<=3; i++){

        //    String data = workbook.getSheet("data").getRow(1).getCell(i).getStringCellValue();
          //  System.out.println(data);
      //  }

        //READING DATA USING TWO FOR LOOP (one for row and one for column/cell)

        for(int i = 1; i<=2; i++){

            for(int j = 0; j<=4; j++) {
                String data = workbook.getSheet("data").getRow(i).getCell(j).getStringCellValue();
                System.out.println(data);

            }

            }


        }

}






