package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobileList {

	
		public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.amazon.in/");
			
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles", Keys.ENTER);
			List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
			List<Integer>list=new ArrayList<Integer>();
			for(WebElement each : priceList) {
				String allpriceText=each.getText();
				String replacedString=allpriceText.replaceAll(",",  "");
				if(!replacedString.isEmpty()) {
					int convertedString=Integer.parseInt(replacedString);
					list.add(convertedString);
					}
			}
			Collections.sort(list);
			System.out.println(list.get(0));
			
			
		}

}
