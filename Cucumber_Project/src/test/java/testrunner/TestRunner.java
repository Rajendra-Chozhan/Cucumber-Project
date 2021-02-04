package testrunner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/Login.feature",
		glue="stepdefinitions",
		dryRun=false,
				monochrome=true,
		tags= {"@sanity"},
		plugin= {"pretty","html:test-output"}
		)
public class TestRunner {

}