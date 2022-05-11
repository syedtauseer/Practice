package com.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {
  static {
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
  }
  
  public static void selectCheckbox(WebElement checkbox) {
	  if(!checkbox.isSelected()) {
		  checkbox.click();  
	  }
		  
  }
  public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Syed/Desktop/New%20folder%20(4)/day11/Element.html");
	Thread.sleep(2000);
	driver.findElement(By.id("A1")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("A1")).sendKeys("syed");
	Thread.sleep(2000);
	WebElement a6 = driver.findElement(By.id("A6"));
	selectCheckbox(a6);
	Thread.sleep(2000);
	
	driver.close();
}
}
