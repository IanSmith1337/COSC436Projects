package Assignment5.Class;
import Assignment5.interfaces.AddOn;
import Assignment5.interfaces.SecondaryHeading;

import java.util.Calendar;
//november 22 - December 26
public class HolidayGreeting implements AddOn, SecondaryHeading {
	public boolean applies(PurchasedItems items) {
		return true;   // SecondaryHeading decorators always applied
	}
	public String getLines() {
		return "* Happy Holidays from Best Buy *";
	}
}