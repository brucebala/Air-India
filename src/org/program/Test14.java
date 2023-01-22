package org.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeliniumDay3\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.swiggy.com/");	
		WebElement a = driver.findElement(By.xpath("//a[text()='Sign up']"));
		a.click();		
		WebElement b = driver.findElement(By.id("mobile"));
		b.sendKeys("9597884987");	
		WebElement c = driver.findElement(By.name("name"));
		c.sendKeys("bala");		
		WebElement d = driver.findElement(By.id("email"));
		d.sendKeys("bala10832@gmail.com");
		WebElement e = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		e.click();
	}

}
