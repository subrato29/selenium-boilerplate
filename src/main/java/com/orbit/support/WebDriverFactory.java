package com.orbit.support;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.driver.TestEngine;
import com.orbit.action.DriverScript;
import com.orbit.util.Util;

public class WebDriverFactory extends DriverScript{
	public static WebDriver initialize() {
		int implicitWait = Integer.parseInt(Util.getProperty("ImplicitWait"));
		if (BROWSER.toUpperCase().equals("CHROME")) {
			System.setProperty ("webdriver.chrome.silentOutput", "true");
			System.setProperty ("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "Drivers" + File.separator + "chromedriver");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
			driver.get(baseUrl);
			TestEngine.deleteCookies();
			TestEngine.maximize();
		} else if (BROWSER.toUpperCase().equals("IE")) {
			//IE code
		} else if (BROWSER.toUpperCase().equals("FIREFOX")) {
			// FF code
		}
		return driver;
	}
}
