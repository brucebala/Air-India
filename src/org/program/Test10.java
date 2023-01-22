package org.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeliniumDay3\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		//id="twotabsearchtextbox"
		WebElement s = driver.findElement(By.id("twotabsearchtextbox"));
		s.sendKeys("one plus mobile");
		
		//id="nav-search-submit-text"
		WebElement m = driver.findElement(By.id("nav-search-submit-text"));
		m.click();
	}
}
