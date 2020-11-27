package Assignment6;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> items = new ArrayList<>();

	public ArrayList<MenuItem> getMenu() {
		return this.items;
	}

	public void addMenuItem(MenuItem item) {
		this.items.add(item);
    }

	public MenuItem getItem(int itemNumber) {
		for (MenuItem menuItem : items) {
            if(menuItem.getItemNumber() == itemNumber){
                return menuItem;
            }
        }
        return null;
	}
}
//the Menu class has the description of each item to include in the Tab