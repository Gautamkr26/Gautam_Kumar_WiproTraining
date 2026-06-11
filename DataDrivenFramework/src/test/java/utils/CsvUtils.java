package utils;

import java.io.BufferedReader;
import java.io.FileReader;

public class CsvUtils {

    public static String[] getLoginData() {

        try {

            BufferedReader br =
                    new BufferedReader(
                    new FileReader(
                    "src/test/resources/testdata/data.csv"));

            br.readLine();

            String line = br.readLine();

            br.close();

            return line.split(",");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}