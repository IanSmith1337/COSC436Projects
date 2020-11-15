package Assignment5.Class;

import java.util.Calendar;

import Assignment5.interfaces.*;

public class Coupon100Get10Percent implements AddOn, Coupon {
   public boolean applies(PurchasedItems items) {
      return items.getTotalCost() > 100;
    }

	public String getLines() {
      Calendar expiration  = Calendar.getInstance();
      expiration.add(Calendar.DAY_OF_MONTH, 14);
      return "10% off your next order!\n" + "Expires:\n" + expiration.toString();
	}
}