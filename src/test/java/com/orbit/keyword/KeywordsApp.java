package com.orbit.keyword;

import com.base.driver.ActionEngine;

import pageobject.Home;

public class KeywordsApp {
	public static void searchFlight() throws InterruptedException {
		String childAge = "10, 14";
		ActionEngine.click(Home.tab_flight);
		ActionEngine.clickElement(Home.multi_city);
		ActionEngine.sendKeys(Home.fromFlying, "Orlando, FL (MCO-Orlando Intl.)");
		ActionEngine.sendKeys(Home.toFlying, "San Antonio, TX (SAT-San Antonio Intl.)");
		ActionEngine.selectByValue(Home.selectAdults, String.valueOf(2));
		ActionEngine.selectByValue(Home.selectChildren, String.valueOf(2));
		ActionEngine.selectByValue("//div[contains(@class, 'available-for-flights')]//span[text() = 'Child 1 age']/..//select", "10");
		ActionEngine.selectByValue("//div[contains(@class, 'available-for-flights')]//span[text() = 'Child 2 age']/..//select", "14");
		for (int i = 1; i < 3; i++) {			
			ActionEngine.sendKeys("//label[@for = 'flight-" + i + 1 + "-origin-hp-flight']//span[text() = 'Flying from']/..//input", "Orlando, FL (MCO-Orlando Intl.)");
			ActionEngine.sendKeys("//label[@for = 'flight-" + i + 1 + "-destination-hp-flight']//span[text() = 'Flying to']/..//input", "San Antonio, TX (SAT-San Antonio Intl.)");
			ActionEngine.clickElement(Home.addAnotherFlight);
		}
		Thread.sleep(3000L);
	}
}
