package com.saucedemo.steps;

import com.saucedemo.browser.DriverManager;
import com.saucedemo.browser.TypeBrowser;
import com.saucedemo.report.Report;
import com.saucedemo.report.ReportType;
import com.saucedemo.report.Screenshot;
import com.saucedemo.utils.PropertiesReader;
import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

import static com.aventstack.extentreports.Status.FAIL;
import static com.aventstack.extentreports.Status.PASS;

public class Hook {

    @Before
    public void setUp(Scenario scenario){
        Report.createTest(scenario.getName(), ReportType.SINGLE);
        WebDriver driver = DriverManager.getDriver(TypeBrowser.CHROME);
        String url = PropertiesReader.getProp("URL");
        driver.get(url);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            Report.log(FAIL, "O cenário falhou: " + scenario.getName(),
                    Screenshot.capture(DriverManager.getDriver(TypeBrowser.CHROME)));
        } else {
            Report.log(PASS, "Cenário executado com sucesso!");
        }
        DriverManager.quitDriver();
    }
}
