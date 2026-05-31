package utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    public static String getData(int row, int cell) {

        String path = "src/test/resources/LoginData.xlsx";

        try {

            FileInputStream fis = new FileInputStream(path);

            XSSFWorkbook wb = new XSSFWorkbook(fis);

            XSSFSheet sheet = wb.getSheet("Sheet1");

            String value = sheet.getRow(row).getCell(cell).getStringCellValue();

            wb.close();

            return value;

        } catch (Exception e) {

            return "";
        }
    }
}