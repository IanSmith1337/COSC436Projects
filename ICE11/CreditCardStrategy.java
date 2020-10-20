package ICE11;

public class CreditCardStrategy implements PaymentStrategy {
    private String cardholderName;
    private String cardNumber;
    private String expDate;
    
    public CreditCardStrategy(String name, String number, String date) {
        this.cardholderName = name;
        this.cardNumber = number;
        this.expDate = date;
    }

    @Override
    public void pay(int amount) {
        
    }
}
