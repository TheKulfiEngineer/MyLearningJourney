package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver contact = new ChromeDriver();
		contact.get("http://leaftaps.com/opentaps/control/main");
		contact.findElement(By.id("username")).sendKeys("demosalesmanager");
		contact.findElement(By.id("password")).sendKeys("crmsfa");
		contact.findElement(By.className("decorativeSubmit")).click();
	    contact.findElement(By.xpath("//img[@src = '/opentaps_images/integratingweb/crm.png']")).click();
	    contact.findElement(By.linkText("Contacts")).click();
	    contact.findElement(By.linkText("Create Contact")).click();
	    contact.findElement(By.id("firstNameField")).sendKeys("marshal");
	    contact.findElement(By.id("lastNameField")).sendKeys("John");
	    contact.findElement(By.name("submitButton")).click();
	    System.out.println(contact.findElement(By.id("viewContact_firstName_sp")).getText());
	    System.out.println(contact.getTitle());
	    Thread.sleep(3000);
	    contact.close();	    
	}

}
