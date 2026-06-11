package utils;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonUtils {

    public static String getValue(String key) {

        try {

            JSONParser parser = new JSONParser();

            JSONObject obj = (JSONObject) parser.parse(
                    new FileReader(
                    "src/test/resources/testdata/data.json"));

            return obj.get(key).toString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}