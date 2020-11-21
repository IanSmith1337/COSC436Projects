package Assignment5.Factory;

import Assignment5.abstractClass.*;
import Assignment5.Class.*;
import Assignment5.interfaces.*;

public class ReceiptFactory {
    String header;  // contains line with “Best Buy”, store_num, street_addr, phone
	String state_code;

	private TaxComputation[] taxComputationsObjs;    // tax computation objects (for each state)
	private TaxComputation state; 
	private AddOn[] addOns;   // secondary header, rebate and coupon add-ons
	
	public ReceiptFactory() {  
		//TaxComputation MD, DE , CA ; 
		//taxComputationsObjs

		
	// constructor
	// 1. Populates array of StateComputation objects and array of AddOn objects (as if downloaded from the BestBuy web site).
	// 2. Reads config file to assign store_num, street_addr, etc.
	// 3. Based on the state code (e.g., “MD”, from the config file) stores appropriate StateComputation object to be used on all receipts.
	}

	public Receipt getReceipt(PurchasedItems items) {
		return null;

	// 1.	Sets the current date of the BasicReceipt.
	// 2.	Attaches the StateComputation object to the BasicReceipt (by call to the setComputation method of BasicReceipt).
	// 3.	Traverses over all AddOn objects, calling the applies method of each. If an AddOn object applies, then determines if the AddOn is of type SecondaryHeader, Rebate, or Coupon. If of type SecondaryHeader, then creates a PreDecorator for othe AddOn. If of type Rebate or Coupon, then creates a PostDecorator.
	// 4.	Links in the decorator object based on the Decorator design pattern.
	// 5.	Adds current date to 
	// 6.	Returns decorated BasicReceipt object as type Receipt.

	}
}
