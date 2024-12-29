package resource;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;

public class ExtentReportNG
{
    public static ExtentReports getReportObject()
    {
        String path = System.getProperty("user.dir")+"//reports//index.html";
        ExtentSparkReporter report = new ExtentSparkReporter(path);
        report.config().setReportName("Web Automation Result");
        report.config().setDocumentTitle("TestResults");

        ExtentReports extents = new ExtentReports();
        extents.attachReporter(report);
        extents.setSystemInfo("Tester", "Megha Sawant");
        return extents;
    }


}
