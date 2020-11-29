package Assignment6;

public class Tab {

    private Menu menu; 
    private Orders orders; 

    public Tab(Menu menu , Orders orders ) {

        this.menu = menu ; 
        this.orders = orders ; 

    }

    public void getTab() {

        double cost = 0; 
        // just gonna  get item cost and stiff and display user tab  

        for (OrderItem item : orders.getOrder()) {
            if(orders.menuHasItem(item.getItemNumber(), menu)){
                MenuItem i = menu.getItem(item.getItemNumber());
                cost += i.getPrice();
            }
        }
    } 
}
//order and prices + total price
/*A tab will be constructed from the Tab class containing all of the ordered items, returned as an array of strings for the user interface to display. Note that a tab needs information from both the Menu and the Orders objects. (The Orders object indicates what menu items were ordered, and the Menu class has the description of each item to include in the Tab.)*/