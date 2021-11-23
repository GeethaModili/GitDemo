package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/login.feature",
		glue = "stepDefinition",
		stepNotifications = true, tags = "@smoketest",
		plugin = {"pretty","html:target/cucumber.html"},
		strict = true)

public class TestRunner {

}
