package com.samplepractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;



public class Demo1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		Dimension dim = new Dimension(500, 800) ; 
		driver.manage().window().setSize(dim);
		Point pos1 = driver.manage().window().getPosition();
		System.out.println(pos1);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		 Dimension st = driver.manage().window().getSize();
		 System.out.println(st);
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://www.yahoo.com");
		 Thread.sleep(3000);
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 driver.get("https://www.fb.com");
		 Thread.sleep(3000);
		driver.quit();

	}
}
