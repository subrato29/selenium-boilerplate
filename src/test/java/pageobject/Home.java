package pageobject;

public class Home {
	public static String tab_flight = "//span[contains(text(), 'Flights')]/../..//button";
	public static String multi_city = "//span[text() = 'Multi-city']";
	public static String selectAdults = "//label[@for = 'flight-adults-hp-flight']//span[contains(text(), 'Adults')]/..//select";
	public static String selectChildren = "//label[@for = 'flight-children-hp-flight']//span[contains(text(), 'Children')]/..//select";
	public static String fromFlying = "//label[@for = 'flight-origin-hp-flight']//span[text() = 'Flying from']/..//input";
	public static String toFlying = "//label[@for = 'flight-destination-hp-flight']//span[text() = 'Flying to']/..//input";
	public static String addAnotherFlight = "//a[text() = 'Add another flight']";
}
