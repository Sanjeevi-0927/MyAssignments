package week4.day1;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class PromptAlert {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt1");
	    driver.switchTo().frame("iframeResult");
		
	    driver.findElement(By.xpath("//button[contains(text(),'Try')]")).click();
		
		Alert alert=driver.switchTo().alert();
		
		String text=alert.getText();
		System.out.println(text);
		
		alert.sendKeys("pepsi");
		alert.accept();
		
		
		

	}

}
