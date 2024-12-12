package junePractice;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class DriverClass {
	RemoteWebDriver driver = new ChromeDriver();
	@BeforeClass
	public void preCondition() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/dashboard.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	@AfterTest
	public void postCondition() {
		driver.close();
	}

}
