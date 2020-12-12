package Assignment6;

import java.util.ArrayList;
import java.util.List;

import Assignment6.CommandPattern.Classes.SystemInterface;

public class Tab {

    private Menu menu; 
    private Orders orders; 
    List<MenuItem> tabItems = new ArrayList<>();

    public Tab(Menu menu, Orders orders) {
        this.menu = menu; 
        this.orders = orders; 
    }

    public List<MenuItem> getTab() {
        for (OrderItem item : orders.getOrder()) {
            if(orders.menuHasItem(item.getItemNumber(), menu)){
                MenuItem mi = SystemInterface.getMenu().getItem(item.getItemNumber());
                this.tabItems.add(mi);
            }
        }
        return this.tabItems;
    } 
}
//order and prices + total price
/*A tab will be constructed from the Tab class containing all of the ordered items, returned as an array of strings for the user interface to display. Note that a tab needs information from both the Menu and the Orders objects. (The Orders object indicates what menu items were ordered, and the Menu class has the description of each item to include in the Tab.)*/