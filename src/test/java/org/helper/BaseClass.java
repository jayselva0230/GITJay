package org.helper;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		return driver;
	}
	
	public static void loadUrl(String url) {
		driver.get(url);
	}
	
	public static void maxBrowser() {
		driver.manage().window().maximize();

	}
	
	public static void fill(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public static void btnClick(WebElement element) {
		element.click();

	}
	
	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	

	}
	
	public void pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public void closeBrowser() {
		driver.close();

	}
	
	
}
