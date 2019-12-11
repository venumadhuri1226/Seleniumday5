package org.test.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhusagar\\Desktop\\SeleniumClass\\SeleniumDay5\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.flipkart.com");
Actions act=new Actions(driver);
//WebElement clickSignin = driver.findElement(By.xpath("//a[text()='Login & Signup']"));
//act.moveToElement(clickSignin);
//clickSignin.click();
WebElement txtUser = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
txtUser.sendKeys("9490442042");
WebElement txtPass = driver.findElement(By.xpath("//input[@type='password']"));
txtPass.sendKeys("geethika1");
WebElement clickLogin = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
clickLogin.click();
WebElement txtHome = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
act.moveToElement(txtHome);
txtHome.click();
WebElement clickClock = driver.findElement(By.xpath("//a[text()='Clocks']"));
act.moveToElement(clickClock);
clickClock.click();

}
}
