package com.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbstractPageStepDefinition {
	protected static WebDriver driver;

	protected WebDriver getDriver() {
		if (driver == null)
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
}
