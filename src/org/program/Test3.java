package org.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args)   {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeliniumDay3\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://demo.automationtesting.in/Register.html");
		
		WebElement a = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required'][1]"));
		a.sendKeys("bala");
		
		WebElement e = driver.findElement(By.xpath("//input[@class='form-control ng-dirty ng-valid-parse ng-valid ng-valid-required ng-touched']"));
		
		e.sendKeys("krishnan");
		
		
	}
}
