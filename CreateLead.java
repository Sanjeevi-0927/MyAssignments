package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sanjeevi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anandan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sanju");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Sample Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sanjeevianandan007@gmail.com");
		WebElement sp=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select gsp=new Select(sp);
		gsp.selectByVisibleText("Indiana");
				
		WebElement submitButton=driver.findElement(By.name("submitButton"));
		submitButton.click();
		System.out.println("The title is :"+driver.getTitle());
		 
		//if(driver.getTitle().contains("TestLeafs")) {
			//System.out.println("I confrim the title has TestLeaf ");
		//}else
			//System.out.println("The title does not have the word testlead");
		
		
		}

}
