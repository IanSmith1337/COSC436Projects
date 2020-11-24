package Assignment6;

public class MenuItem {
    private String itemName;
    private int itemNumber;
    private String description;
    private double price;

    public MenuItem(String itemName, int itemNumber, String description, double price){
        this.itemName = itemName;
        this.itemNumber = itemNumber;
        this.description = description;
        this.price = price;
    }
    public String getItemName() {
        return itemName;
    }
    public int getItemNumber() {
        return itemNumber;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
}
//A MenuItem object will store the menu item #, the description, and its cost

