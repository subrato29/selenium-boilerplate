package com.orbit.action;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import com.base.driver.TestEngine;
import com.orbit.support.WebDriverFactory;
import com.orbit.util.Util;

public class DriverScript {
	public static String BROWSER = "";
	public static WebDriver driver = null;
	public static String baseUrl = "";
	
	public static boolean isRunnable (boolean isRun) {
		driver = null;
		if (isRun) {
			if (driver == null) {
				baseUrl = "https://www.orbitz.com/";
				BROWSER =  Util.getProperty("Browser");
				WebDriverFactory.initialize();
			}
			return true;
		} else {
			return false;
		}
	}
	
	@AfterTest
	public void tearDown () {
		TestEngine.quit();
	}
	
}
