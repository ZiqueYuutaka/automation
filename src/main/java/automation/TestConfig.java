package automation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages={"automation","automation.steps"})
@PropertySource("test.properties")
public class TestConfig {

	/*@Bean
	@Scope("cucumber-glue")
	public EventFiringWebDriver eventFiringWebDriver(){
		BrowserUtils browserUtils = new BrowserUtils();
		return browserUtils.getWebDriver();
	}*/
	/*public BrowserUtils browserUtils(){
		return new BrowserUtils();
	}*/
}
