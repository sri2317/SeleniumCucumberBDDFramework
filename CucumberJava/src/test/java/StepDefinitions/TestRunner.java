package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber; //for Cucumber.class

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinitions"},
monochrome = true,
plugin = { "pretty",  "junit:target/Junitreports/report.xml",
						"json:target/JSONreports/report.json","html:target/HtmlReports"},
tags= {"@Login or @Home"}
		
		)

public class TestRunner {
}


