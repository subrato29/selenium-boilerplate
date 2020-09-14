package testscripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.orbit.action.DriverScript;
import com.orbit.keyword.KeywordsApp;

public class TestScript extends DriverScript{

	@Test
	public void test1() throws InterruptedException {
		if (isRunnable(true)) {
			KeywordsApp.searchFlight();
		}
	}
	
}
