package org.cts.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\induja udhayak\\RobotClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html"); 
	WebElement username = driver.findElement(By.xpath("//span[text()='Introduction']"));
		
		driver.manage().window().maximize();
	
Actions acc=new Actions(driver);
Thread.sleep(2000);
acc.doubleClick(username).perform();
   
Robot r=new Robot();
r.keyPress(KeyEvent.VK_SHIFT);

for(int i=0;i<4;i++) {
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
}
Thread.sleep(2000);
r.keyRelease(KeyEvent.VK_SHIFT);
acc.contextClick(username).perform();

r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

r.keyPress(KeyEvent.VK_ENTER);
r.keyPress(KeyEvent.VK_ENTER);


	}}	

