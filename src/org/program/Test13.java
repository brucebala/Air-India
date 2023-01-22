package org.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeliniumDay3\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/register?refere");
		
		////input[@class='form-control mobileNumberInput']
		WebElement s = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		s.sendKeys("9597884987");
		
		WebElement b = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		b.click();
		
		
	}
}
