package org.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeliniumDay3\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		//heading201
		
		WebElement a = driver.findElement(By.id("heading201"));
	    a.click();
	    
	    Thread.sleep(3000);
	    WebElement b = driver.findElement(By.xpath("//a[text()='Resume Model-1 ']"));
	    b.click();
	}
}
