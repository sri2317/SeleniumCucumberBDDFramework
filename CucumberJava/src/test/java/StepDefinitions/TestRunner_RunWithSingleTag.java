package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber; //for Cucumber.class

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/FeatureWithTags",
glue={"StepDefinitions"},
//tags= {"@smoke or @regression"}
//tags= {"@smoke or  @regression and @important"}
//tags= {"(@smoke or  @regression) and (@important)"}		
//tags= {"@regression and not @smoke"}
tags= {"@Mustrun"}
		
		)

public class TestRunner_RunWithSingleTag {
}

