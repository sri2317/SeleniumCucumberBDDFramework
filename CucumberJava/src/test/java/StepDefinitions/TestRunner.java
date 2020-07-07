package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber; //for Cucumber.class

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinitions"},
monochrome = true,

plugin = { "pretty",  "junit:target/Junitreports/report.xml",
						"json:target/JSONreports/report.json","html:target/HtmlReports"},
tags="@smoke"
		
		)

public class TestRunner {
}

//monochrome = true
//
//plugin = { "pretty", "html:target/reports"}
//plugin = { "pretty", "json:target/reports/cucumber.json"}
//plugin = { "pretty",  "junit:target/reports/cucumber.xml"}
//
//tags="@smoketest"

