package Assignment5.Class;

import java.util.Calendar;

import Assignment5.abstractClass.*;
import Assignment5.interfaces.*;

public class BasicReceipt implements Receipt {
	private static String storeInfo;  	// store number, store address, phone number
	private String stateCode;  	// MD, DE, CA or MA

	private static PurchasedItems items;
	private static Calendar date;
	private static TaxComputation tc;

	public BasicReceipt(PurchasedItems items) {
		BasicReceipt.items = items;
	}

	public static void setTaxComputation(TaxComputation tc) {
		BasicReceipt.tc = tc;
	}

	public static void setDate(Calendar date) { 
		BasicReceipt.date = date; 
	}

	public static void setStoreInfo(String storeInfo) {
		BasicReceipt.storeInfo = storeInfo;
	}

	@Override
	public void prtReceipt() {
		System.out.print(BasicReceipt.storeInfo);
		printDate(date);
		System.out.println("");
		for(StoreItem item : items.getItems()) {
			System.out.print(item.getItemCode());
			System.out.print("     ");
			System.out.print(item.getItemDescription());
			System.out.print("     ");
			System.out.print(item.getItemPrice());
			System.out.println();
		}
		System.out.println("\nSubtotal: " + BasicReceipt.items.getTotalCost());
		System.out.println("Tax: " + BasicReceipt.items.getTotalCost() * tc.computeTax(items, date));
		System.out.println("Total: " + ((BasicReceipt.items.getTotalCost() * tc.computeTax(items, date)) + BasicReceipt.items.getTotalCost()) + "\n");
	}

	private void printDate(Calendar date) {
        String currently = "";
        String ampm;
        currently = currently.concat(Integer.toString(date.get(Calendar.MONTH)+1)); 
        currently = currently.concat("/"); 
        currently = currently.concat(Integer.toString(date.get(Calendar.DAY_OF_MONTH))); 
        currently = currently.concat("/");
        currently = currently.concat(Integer.toString(date.get(Calendar.YEAR)));
        currently = currently.concat(" ");
        currently = currently.concat(Integer.toString(date.get(Calendar.HOUR_OF_DAY)-12));
        currently = currently.concat(":");
        currently = currently.concat(Integer.toString(date.get(Calendar.MINUTE))); 
        if (date.get(Calendar.HOUR_OF_DAY) > 12) {
            ampm = " PM";
        } else {
            ampm = " AM";
        }
        currently = currently.concat(ampm);
        System.out.println(currently);
    }
}