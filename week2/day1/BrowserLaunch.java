package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver launch = new ChromeDriver();
		launch.get("http://leaftaps.com/opentaps/control/main");
		launch.manage().window().maximize();
		Thread.sleep(3000);
		launch.close();
	}

}
