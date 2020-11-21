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

	@Override
	public void prtReceipt() {
		//TODO
	}
}