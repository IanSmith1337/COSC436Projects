package Assignment5.Class;

import java.util.ArrayList;

public class PurchasedItems {
	private ArrayList<StoreItem> items;  	
	
	public PurchasedItems() { 
		this.items = new ArrayList<>();
 	}

	public void addItem(StoreItem item) {
		items.add(item);		
	}

	public double getTotalCost() {
		double total = 0;
		for(StoreItem item : items) {
			total += Double.parseDouble(item.getItemPrice());
		}
		return total;
	}

	public boolean containsItem(String itemCode) {
		for(StoreItem item : items) {
			if(item.getItemCode().equals(itemCode)){
				return true;
			}
		}
		return false;
	}
}