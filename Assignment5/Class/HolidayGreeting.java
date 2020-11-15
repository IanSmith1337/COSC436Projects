package Assignment5.Class;
import Assignment5.interfaces.AddOn;
import Assignment5.interfaces.SecondaryHeading;

public class HolidayGreeting implements AddOn, SecondaryHeading {
	public boolean applies(PurchasedItems items) {
		return true;   // SecondaryHeading decorators always applied
	}
	public String getLines() {
		return "* Happy Holidays from Best Buy *";
	}
}