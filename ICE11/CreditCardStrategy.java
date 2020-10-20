package ICE11;

import java.util.logging.Level; 
import java.util.logging.Logger; 

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
        Logger logger = Logger.getLogger(CreditCardStrategy.class.getName()); 
        logger.log(Level.INFO, "Paying $" + amount + " with " + cardholderName + "'s card ending in " + cardNumber.substring(12) + ", expiring on " + expDate + ".");
    }
}
