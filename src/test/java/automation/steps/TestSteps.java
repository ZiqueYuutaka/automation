package automation.steps;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import automation.utils.BrowserUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

//@ContextConfiguration() //breaks the test
//@ContextConfiguration("classpath:cucumber.xml")
public class TestSteps {
	
	BrowserUtils utils = new BrowserUtils();
	EventFiringWebDriver driver = null;
	
	@Given("the user opens the browser")
	public void the_user_opens_the_browser() {
		System.out.println("===>>>opening browser");
		System.out.println("===>>>utils.browser: " + utils.browser);
		driver = utils.getWebDriver();
	}

	@Then("the browser must open")
	public void the_browser_must_open() {
		System.out.println("===>>>browser is open...");
	}

}
