package automation.steps;

import org.junit.runner.RunWith;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import automation.TestConfig;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

//@ContextConfiguration() //breaks the test
//@ContextConfiguration("classpath:cucumber.xml")
@ContextConfiguration(classes={TestConfig.class})
//@SpringBootTest(classes=TestConfig.class)
//@Component
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSteps {
	
	/*BrowserUtils utils = new BrowserUtils();
	EventFiringWebDriver driver = null;*/
	@Autowired
	EventFiringWebDriver driver;
	
	@Given("the user opens the browser")
	public void the_user_opens_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("the browser must open")
	public void the_browser_must_open() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
