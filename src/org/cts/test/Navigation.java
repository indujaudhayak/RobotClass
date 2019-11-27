package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\induja udhayak\\RobotClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("induja");
		WebElement p = driver.findElement(By.id("pass"));
		p.sendKeys("1234");
	WebElement b = driver.findElement(By.xpath("//input[@value='Log In']"));
b.click();
		
driver.navigate().back();
Thread.sleep(1000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(3000);
driver.navigate().to("https://www.facebook.com/");
System.out.println("234567");		
		
	}

}
