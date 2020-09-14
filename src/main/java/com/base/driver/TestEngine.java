package com.base.driver;

import org.openqa.selenium.By;

import com.orbit.action.DriverScript;

public class TestEngine extends DriverScript{
	
	static int MAXOUT = 100;
	
	public static void deleteCookies() {
		driver.manage().deleteAllCookies();
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void quit() {
		try {
			driver.quit();
		} catch (Throwable t) {
			
		}
	}
	
	public static boolean isElemenetPresent (String locator) {
		int nStartTime = 0;
		while (nStartTime < MAXOUT) {
			try {
				if (driver.findElements(By.xpath(locator)).size() > 0) {
					nStartTime = MAXOUT + 1;
					return true;
				}
			} catch (Throwable t) {
				nStartTime++;
			}
 		}
		return false;
	}
	
	public static boolean isElemenetPresent (String locator, int timtout) {
		int nStartTime = 0;
		while (nStartTime < timtout) {
			try {
				if (driver.findElements(By.xpath(locator)).size() > 0) {
					nStartTime = timtout + 1;
					return true;
				}
			} catch (Throwable t) {
				nStartTime++;
			}
 		}
		return false;
	}
}
