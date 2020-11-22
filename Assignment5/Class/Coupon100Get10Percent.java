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
            return print(expiration);
      }

      private String print(Calendar date) {
            String expire = "10% off your next order!\n" + "Expires:\n ";
            String ampm;
            expire = expire.concat(Integer.toString(date.get(Calendar.MONTH)+1)); 
            expire = expire.concat("/"); 
            expire = expire.concat(Integer.toString(date.get(Calendar.DAY_OF_MONTH))); 
            expire = expire.concat("/");
            expire = expire.concat(Integer.toString(date.get(Calendar.YEAR)));
            expire = expire.concat(" ");
            expire = expire.concat(Integer.toString(date.get(Calendar.HOUR_OF_DAY)-12));
            expire = expire.concat(":");
            expire = expire.concat(Integer.toString(date.get(Calendar.MINUTE))); 
            if (date.get(Calendar.HOUR_OF_DAY) > 12) {
                ampm = " PM";
            } else {
                ampm = " AM";
            }
            expire = expire.concat(ampm);
            return expire;
        }
}