package Assignment5.Factory;

import Assignment5.abstractClass.*;

import java.io.File;
import java.rmi.NoSuchObjectException;
import java.util.Calendar;
import java.util.Scanner;

import Assignment5.Class.*;
import Assignment5.TaxComputation.CATaxComputation;
import Assignment5.TaxComputation.DETaxComputation;
import Assignment5.TaxComputation.MATaxComputation;
import Assignment5.TaxComputation.MDTaxComputation;
import Assignment5.interfaces.*;

public class ReceiptFactory {
	String header; // contains line with “Best Buy”, store_num, street_addr, phone
	String state_code;
	
	private TaxComputation[] taxComputationsObjs = new TaxComputation[4]; // tax computation objects (for each state)
	private TaxComputation state;
	private AddOn[] addOns = new AddOn[3]; // secondary header, rebate and coupon add-ons

	public ReceiptFactory() throws NoSuchObjectException {

		for(int i = 0; i < taxComputationsObjs.length; i++) {
			Object[] a = {new MDTaxComputation(), new MATaxComputation(), new CATaxComputation(), new DETaxComputation()};
			this.taxComputationsObjs[i] = (TaxComputation) a[i];
		}

		for(int i = 0; i < addOns.length; i++) {
			Object[] a = {new HolidayGreeting(), new Rebate1406(), new Coupon100Get10Percent()};
			this.addOns[i] = (AddOn) a[i];
		}

		try (Scanner file = new Scanner(new File("Assignment5/config.txt"))) {
			String store_addr = file.nextLine();
			int phone = Integer.parseInt(file.nextLine());
			int store_num = Integer.parseInt(file.nextLine());
			this.header = "Best Buy #" + store_num + "\n    ";
			this.header = this.header.concat(phone + "    \n");
			this.header = this.header.concat(store_addr + "\n");
			this.state_code = file.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		switch(this.state_code){
			case "MD":
				this.state = this.taxComputationsObjs[0];
				break;
			case "MA":
				this.state = this.taxComputationsObjs[1];
				break;
			case "CA":
				this.state = this.taxComputationsObjs[2];
				break;
			case "DE":
				this.state = this.taxComputationsObjs[3];
				break;
			default:
				throw new NoSuchObjectException(this.state_code);
		}
	}

	public Receipt getReceipt(PurchasedItems items, Calendar date) {
		BasicReceipt complete = new BasicReceipt(items);
		complete.setDate(date);
		complete.setTaxComputation(this.state);

		for (AddOn a : addOns) {
			if(a.applies(items)){
				String interface = a.getClass().getInterfaces()[1].toString();
				if(interface.toString().equals("Rebate")) {

				}
			}
		}
	// TODO
	// 1.	Sets the current date of the BasicReceipt.
	// 2.	Attaches the StateComputation object to the BasicReceipt (by call to the setComputation method of BasicReceipt).
	// 3.	Traverses over all AddOn objects, calling the applies method of each. If an AddOn object applies, then determines if the AddOn is of type SecondaryHeader, Rebate, or Coupon. If of type SecondaryHeader, then creates a PreDecorator for othe AddOn. If of type Rebate or Coupon, then creates a PostDecorator.
	// 4.	Links in the decorator object based on the Decorator design pattern.
	// 5.	Adds current date to 
	// 6.	Returns decorated BasicReceipt object as type Receipt.

	}
}
