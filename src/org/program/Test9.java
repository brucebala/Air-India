package org.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeliniumDay3\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
        WebElement d = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));//_2IX_2- _3mctLh VJZDxU
        d.sendKeys("bala10832@gmail.com");
        WebElement s = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
        s.sendKeys("9597884987");
        WebElement buttn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
        buttn.click();
        
        driver.quit();
	}

}
