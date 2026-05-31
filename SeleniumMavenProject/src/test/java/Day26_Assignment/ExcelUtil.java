package Day26_Assignment;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;

public class ExcelUtil {

    public static String getData(int row,int col) throws Exception {

        FileInputStream fis =
                new FileInputStream("Book1.xlsx");

        Workbook wb =
                WorkbookFactory.create(fis);

        Sheet sh = wb.getSheetAt(0);

        String value =
                sh.getRow(row).getCell(col).toString();

        wb.close();

        return value;
    }
}