package org.test.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question1 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhusagar\\Desktop\\SeleniumClass\\SeleniumDay5\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	Actions act=new Actions(driver);
	WebElement bankSource = driver.findElement(By.id("credit2"));
	act.contextClick(bankSource).perform();
	WebElement bankDest = driver.findElement(By.id("bank"));
	act.contextClick(bankDest).perform();
	act.dragAndDrop(bankSource, bankDest).perform();
	
	
	
}
}