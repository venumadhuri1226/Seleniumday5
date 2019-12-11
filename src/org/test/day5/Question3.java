package org.test.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhusagar\\Desktop\\SeleniumClass\\SeleniumDay5\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.gettyimages.in/");
	Actions act=new Actions(driver);
	WebElement clickEditTutorial = driver.findElement(By.xpath("//a[text()='EDITORIAL']"));
	WebElement selectEditTutorial = driver.findElement(By.xpath("(//li[@class='landing-top-menu__item'])[2]"));
	act.moveToElement(selectEditTutorial).perform();
	act.contextClick(selectEditTutorial).perform();
	selectEditTutorial.click();
	WebElement clickEnter = driver.findElement(By.xpath("(//li[@class='landing-secondary-menu__item'])[4]"));
	
	act.moveToElement(clickEnter).perform();
	act.contextClick(clickEnter).perform();
	clickEnter.click();
	
}
}
