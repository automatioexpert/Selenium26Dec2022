package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Constant.ProjectConstant;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static String browser = "chrome";

	@BeforeSuite
	public void setUp() {
		if (driver == null) {
			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}

			else {
				System.out.println("Invalid browser is provided");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(ProjectConstant.URL);
			System.out.println("Browser Configuration completed");
		}

	}

	@AfterSuite
	public void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}
}
