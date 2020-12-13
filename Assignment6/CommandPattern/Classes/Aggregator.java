package Assignment6.CommandPattern.Classes;
import Assignment6.*;
import Assignment6.UIDecorator.UI;

public class Aggregator {
    private Menu menuObject; 
    private Orders orderObject; 
    private Tab tabObject;
    private MenuItem i;

    public Aggregator() {
        menuObject = new Menu();
        i = new MenuItem("Big Salad", 1, "A big salad.", 5.00);
        menuObject.addMenuItem(i);
        i = new MenuItem("Big Pasta", 2, "A big bowl of pasta.", 5.00);
        menuObject.addMenuItem(i);
        i = new MenuItem("Big Soup", 3, "A big bowl of soup.", 5.00);
        menuObject.addMenuItem(i);
        i = new MenuItem("Big Cake", 4, "A big cake.", 5.00);
        menuObject.addMenuItem(i);
        i = new MenuItem("Big Baked Potato", 5, "A big baked potato.", 5.00);
        menuObject.addMenuItem(i);
        i = new MenuItem("Big Steak", 6, "A big steak.", 5.00);
        menuObject.addMenuItem(i);
        i = new MenuItem("Big Bread Basket", 7, "A big bread basket.", 5.00);
        menuObject.addMenuItem(i);
        i = new MenuItem("Big Milkshake", 8, "A big milkshake.", 5.00);
        menuObject.addMenuItem(i);
        i = new MenuItem("Big Drink", 9, "A big drink.", 5.00);
        menuObject.addMenuItem(i);
        tabObject = new Tab(menuObject, orderObject);
    }
    
    public Menu getMenu() {
        return menuObject;
    } 

    public Orders getOrder() {
        orderObject = UI.origin.getOrders();
        return orderObject;
    } 

    public Tab getTab() {
        return tabObject;
    } 

}
