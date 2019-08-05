package automation.utils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//@PropertySource("test.properties")
//@Component
//@Scope("cucumber-glue")
public class BrowserUtils {
	
	//I can also just use the environment variable
	public String browser="chrome";
	public String browserVersion="75.0.3770.140";
	
	private final String DEFAULT_DOWNLOAD_DIRECTORY = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator
            + "resources" + File.separator + "downloadFiles" + File.separator + "allDownloads";
	
	public EventFiringWebDriver getWebDriver(){
		switch(this.browser){
		case "chrome":
			return getChromeDriver();
			
			
		}
		return null;
	}
	
	private EventFiringWebDriver getChromeDriver(){
		EventFiringWebDriver eDriver =null;
		WebDriver driver = null;
		
		System.out.println("Preparing local Chrome driver.");
        //Currently broken
        //WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().version(browserVersion).setup();
        
        System.out.println("local Chrome driver prepared....");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
        
        //set console log properties
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.BROWSER, Level.ALL);
        chromeOptions.setCapability(CapabilityType.LOGGING_PREFS,logPrefs);
        //////////////////////////////
   //     chromeOptions.addArguments(Arrays.asList("--incognito"));
        chromeOptions.addArguments("disable-infobars");
        // options.addArguments("--lang=en-US");
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("intl.accept_languages", "en-us, en");
        // below is the default location of file downloads for downloads that do not ask for save location
        prefs.put("download.default_directory", DEFAULT_DOWNLOAD_DIRECTORY);
        chromeOptions.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(chromeOptions);

        //Fix while WebDriverManager is being fixed
        //System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Chrome_WebDriver\\chromedriver_win32\\chromedriver.exe");
        //driver = new ChromeDriver(chromeOptions);
        
        return new EventFiringWebDriver(driver);
	}
}
