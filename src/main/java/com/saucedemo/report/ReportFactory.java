package com.saucedemo.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.saucedemo.utils.CreateFolder;
import com.saucedemo.utils.DateTime;
import org.openqa.selenium.WebDriver;
import java.io.File;

public class ReportFactory {
    public static WebDriver driver;
    public static final String PATH_REPORT = System.getProperty("user.dir") + File.separator + "Report"+ File.separator + "Report" + DateTime.getDateTimeFormatReport();
    public static ExtentReports extentReports;
    public static ExtentSparkReporter extentSparkReporter;

    public static void configReportExtent(){
        CreateFolder.createFolderReport(PATH_REPORT);
        extentSparkReporter = new ExtentSparkReporter(PATH_REPORT + File.separator + "Report_" + DateTime.getDateTimeFormatReport() + ".html");
        extentSparkReporter.config().setDocumentTitle("Relatório de Execução Automação Capacitação");
        extentSparkReporter.config().setReportName("Relatório de Execução de Testes");
        extentSparkReporter.config().setTheme(Theme.STANDARD);
        extentSparkReporter.config().setEncoding("UTF-8");
        extentSparkReporter.config().setTimeStampFormat(" EEEE , MMMM dd, yyyy , hh:mm a '('zzz')' ");

        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);
    }

    protected synchronized static ExtentReports getInstance(){
        if (extentReports == null) {
            configReportExtent();
        }
        return extentReports;
    }
}
