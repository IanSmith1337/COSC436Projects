package Assignment5.Class;

import java.util.Calendar;

import Assignment5.abstractClass.*;
import Assignment5.interfaces.*;

public class BasicReceipt implements Receipt {
	private String storeInfo;  	// store number, store address, phone number
	private String stateCode;  	// MD, DE, CA or MA

	private PurchasedItems items;
	private Calendar date;
	private TaxComputation tc;

	public BasicReceipt(PurchasedItems items) {
		this.items = items;
	}

	public void setTaxComputation(TaxComputation tc) { 
		this.tc = tc; 
	}

	public void setDate(Calendar date) { 
		this.date = date; 
	}

	public void setStoreInfo(String storeInfo) {
		this.storeInfo = storeInfo;
	}

	@Override
	public void prtReceipt() {
		System.out.print(this.storeInfo);
		printDate(date);
		for(StoreItem item : items.getItems()) {
			System.out.print(item.getItemCode());
			System.out.print("     ");
			System.out.print(item.getItemDescription());
			System.out.print("     ");
			System.out.print(item.getItemPrice());
			System.out.println();
		}
		System.out.println("Subtotal: " + this.items.getTotalCost());
		System.out.println("Tax: " + this.items.getTotalCost() * tc.computeTax(items, date));
		System.out.println("Total: " + ((this.items.getTotalCost() * tc.computeTax(items, date)) + this.items.getTotalCost()));
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