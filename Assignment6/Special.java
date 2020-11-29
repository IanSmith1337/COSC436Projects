
package Assignment6; 
public class Special extends MenuItem{
    private String itemName;
    private int[] itemNumbers;
    private String description;
    private double price;

    public Special(String itemName, int[] itemNumbers, String description, double price) {
        super(itemName, itemNumbers, description, price);
    }

    public int[] getItemNumbers() {
        return itemNumbers;
    }
}
