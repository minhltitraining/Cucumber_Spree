package com.weborder.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	protected static WebDriver driver;

	protected static WebDriver getDriver() {
		if (driver == null)
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();;
			driver.manage().window().maximize();
		}
		return driver;
	}
}
