package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class WindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://leafground.com/dashboard.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	    
		driver.findElement(By.xpath("//i[contains(@class,'pi pi-globe layout-menuitem-icon')]")).click();
		driver.findElement(By.xpath("//span[text()='Window']")).click();
		String currentWindow=driver.getWindowHandle();
		System.out.println(currentWindow);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> set=driver.getWindowHandles();
		System.out.println(set);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		List<String> list = new ArrayList<>(set);
		String windowHandle= list.get(1);
		driver.switchTo().window(windowHandle);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.switchTo().window(currentWindow);
		
		

	}

}
;
