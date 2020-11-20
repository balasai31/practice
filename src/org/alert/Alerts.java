package org.alert;

import java.awt.AWTException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mani KDM\\eclipse-workspace\\Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		
		WebElement fstClk = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		fstClk.click();
		
		WebElement scdClk = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		scdClk.click();
		
		Alert fst = driver.switchTo().alert();
	     fst.sendKeys("Hi");
		
		
	}

}
