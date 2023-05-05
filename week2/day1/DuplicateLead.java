package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		    ChromeDriver lead = new ChromeDriver();
			lead.get("http://leaftaps.com/opentaps/control/main");
			lead.findElement(By.id("username")).sendKeys("demosalesmanager");
			lead.findElement(By.id("password")).sendKeys("crmsfa");
			lead.findElement(By.className("decorativeSubmit")).click();
		    lead.findElement(By.xpath("//img[@src = '/opentaps_images/integratingweb/crm.png']")).click();
		    lead.findElement(By.xpath("//a[text() = 'Leads']")).click();
		    lead.findElement(By.linkText("Create Lead")).click();
		    lead.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		    lead.findElement(By.id("createLeadForm_firstName")).sendKeys("Siva");
		    lead.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		    lead.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("The_Kulfi_Engineer");
		    lead.findElement(By.id("createLeadForm_departmentName")).sendKeys("Quality");
		    lead.findElement(By.id("createLeadForm_description")).sendKeys("ISTQB Certified");
		    lead.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("siva123@gmail.com");
		    lead.findElement(By.name("submitButton")).click();
		    System.out.println(lead.getTitle());	 
		    lead.findElement(By.linkText("Duplicate Lead")).click();
		    lead.findElement(By.id("createLeadForm_companyName")).clear();
		    lead.findElement(By.id("createLeadForm_firstName")).clear();
		    lead.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTest");
		    lead.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhoni");
		    lead.findElement(By.name("submitButton")).click();
		    System.out.println(lead.getTitle());	 
		    Thread.sleep(3000);
		    lead.close();
	}
	

}
