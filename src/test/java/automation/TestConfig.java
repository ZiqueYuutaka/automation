package automation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import automation.utils.BrowserUtils;

@Configuration
public class TestConfig {

	@Bean
	public BrowserUtils browserUtils(){
		return new BrowserUtils();
	}
}
