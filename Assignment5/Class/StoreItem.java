package Assignment5.Class;


public class StoreItem {
    private String itemCode; // e.g., 3010
    private String itemDescription; // e.g., Dell Laptop
    private String itemPrice;

    public StoreItem(String code, String descript, String price) {
        this.setItemCode(code);
        this.setItemDescription(descript);
        this.setItemPrice(price);
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
}
