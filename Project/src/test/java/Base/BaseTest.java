package Base;

	import io.github.bonigarcia.wdm.WebDriverManager;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;
	import utils.ConfigReader;

	import java.time.Duration;

	public class BaseTest {
	    protected WebDriver driver;
	    protected ConfigReader config;

	    @BeforeClass
	    public void setup() {
	        config = new ConfigReader();
	        String browser = config.getProperty("browser");
	        if (browser.equalsIgnoreCase("chrome")) {
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	        }
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        driver.get(config.getProperty("url"));
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	           // driver.quit();
	        }
	    }
	}


