package Rest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    public static ExtentReports extent;

    public static ExtentReports getReport() {

        if(extent == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter("test-output/APIReport.html");

            extent = new ExtentReports();
            extent.attachReporter(spark);

            extent.setSystemInfo("Tester", "Gautam");
            extent.setSystemInfo("Project", "DummyJSON API Automation");
        }

        return extent;
    }
}