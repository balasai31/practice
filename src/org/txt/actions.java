package org.txt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mani KDM\\eclipse-workspace\\Practice\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement txtsrh = driver.findElement(By.xpath("//input[@dir='auto']"));
		txtsrh.sendKeys("iphone 7",Keys.ENTER);
		
		WebElement dfg = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		Thread.sleep(4000);
		dfg.click();
		
				
				
		
	}

}
