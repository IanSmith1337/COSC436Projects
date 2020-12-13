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