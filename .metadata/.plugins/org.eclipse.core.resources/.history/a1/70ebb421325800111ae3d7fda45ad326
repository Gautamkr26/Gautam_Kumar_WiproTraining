package Rest;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

    public static String getCellData(int row, int col) throws Exception {

        FileInputStream fis =
                new FileInputStream("DummyJSON_API_TestData.xlsx");

        Workbook wb = WorkbookFactory.create(fis);

        Sheet sh = wb.getSheetAt(0);

        DataFormatter formatter = new DataFormatter();

        String data =
                formatter.formatCellValue(sh.getRow(row).getCell(col));

        wb.close();

        return data;
    }

    public static int getRowCount() throws Exception {

        FileInputStream fis =
                new FileInputStream("DummyJSON_API_TestData.xlsx");

        Workbook wb = WorkbookFactory.create(fis);

        Sheet sh = wb.getSheetAt(0);

        int rows = sh.getLastRowNum();

        wb.close();

        return rows;
    }
}