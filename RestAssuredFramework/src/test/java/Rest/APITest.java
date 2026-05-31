package Rest;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class APITest {

    @Test
    public void executeAPI() throws Exception {

        ExtentReports extent = ExtentManager.getReport();

        int rows = ExcelUtility.getRowCount();

        for (int i = 1; i <= rows; i++) {

            String tcId = ExcelUtility.getCellData(i, 0);
            String apiName = ExcelUtility.getCellData(i, 1);
            String method = ExcelUtility.getCellData(i, 2);
            String url = ExcelUtility.getCellData(i, 3);

            int expectedStatus =
                    Integer.parseInt(ExcelUtility.getCellData(i, 4));

            ExtentTest test =
                    extent.createTest(tcId + " - " + apiName);

            try {

                if (method.equalsIgnoreCase("GET")) {

                    given()
                    .when()
                    .get(url)
                    .then()
                    .statusCode(expectedStatus);

                    test.pass("GET Passed : " + url);
                }

                else if (method.equalsIgnoreCase("POST")) {

                    String body = "{}";

                    if (url.contains("/users/add")) {
                        body =
                        "{"
                        + "\"firstName\":\"Gautam\","
                        + "\"lastName\":\"Kumar\","
                        + "\"age\":23"
                        + "}";
                    }

                    else if (url.contains("/products/add")) {
                        body =
                        "{"
                        + "\"title\":\"BMW Pencil\""
                        + "}";
                    }

                    else if (url.contains("/auth/login")) {
                        body =
                        "{"
                        + "\"username\":\"emilys\","
                        + "\"password\":\"emilyspass\""
                        + "}";
                    }

                    given()
                    .contentType("application/json")
                    .body(body)
                    .when()
                    .post(url)
                    .then()
                    .statusCode(expectedStatus);

                    test.pass("POST Passed : " + url);
                }

                else if (method.equalsIgnoreCase("PUT")) {

                    String body =
                    "{"
                    + "\"title\":\"Updated Product\""
                    + "}";

                    given()
                    .contentType("application/json")
                    .body(body)
                    .when()
                    .put(url)
                    .then()
                    .statusCode(expectedStatus);

                    test.pass("PUT Passed : " + url);
                }

                else if (method.equalsIgnoreCase("DELETE")) {

                    given()
                    .when()
                    .delete(url)
                    .then()
                    .statusCode(expectedStatus);

                    test.pass("DELETE Passed : " + url);
                }

            }
            catch (Exception e) {

                test.fail(e.getMessage());
            }
        }

        extent.flush();
    }
}