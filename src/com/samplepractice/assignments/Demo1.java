package com.samplepractice.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1 {
  static {
	  System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
	    }
  public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.google.com");
	driver.quit();

}
}
