package Assignment6;

public class OrderItem {
    private int itemNumber;

    public OrderItem(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public int getItemNumber(){
        return itemNumber;
    }


}
//An OrderItem object will store an order by its item number only (not its description)