package com.swarpa.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "classpath:features",
        glue = "com.swarpa.stepdefinitions",
        tags = " @visa",
        plugin = {
                "pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "html:target/cucumber-reports/cucumber-pretty.html"
        }
)
public class TestNgRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
