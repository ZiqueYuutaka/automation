package automation.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		plugin = { "pretty", "json:target/json/TestFeature.json" }, 
		glue = "automation", 
		features = "classpath:features/TestFeature.feature")
public class TestRunner {

}
