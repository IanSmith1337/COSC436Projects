package Assignment4;
public class MenuItem {
    protected String itemName; 
    protected int category; 
    protected boolean heartHealthy; 
    protected double price; 

public MenuItem(String itemName , int category , boolean heartHealthy, double price ){

    this.itemName = itemName ;
    this.category = category; 
    this.heartHealthy = heartHealthy;
    this.price = price; 

}
   
public int getCategory() {
    return category;
}
public String getItemName() {
    return itemName;
}
public double getPrice() {
    return price;
}
public boolean heartHealthy(){
    return heartHealthy; 
}
    
}
