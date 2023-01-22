package org.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeliniumDay3\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.cleartrip.com/trains");
		
		WebElement s = driver.findElement(By.id("from_station"));
		s.sendKeys("coimbatore");
		//id="to_station"
		WebElement m = driver.findElement(By.id("to_station"));
		m.sendKeys("chennai");
		//id="trainFormButton"
		WebElement r = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		r.click();
		
				
	}				
}
