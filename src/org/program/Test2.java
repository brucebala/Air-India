package org.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeliniumDay3\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement s = driver.findElement(By.xpath("//input[@id='email']"));	
		
		s.sendKeys("bala10832@gmail.com");
		
		WebElement m = driver.findElement(By.xpath("//input[@id='pass']"));
		
		m.sendKeys("9597884987");
		
		WebElement n = driver.findElement(By.xpath("//button[@value='1']"));
		
		n.click();
	}

	
	
}
