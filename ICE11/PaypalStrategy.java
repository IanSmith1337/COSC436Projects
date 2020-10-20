package ICE11;

import java.util.logging.Level; 
import java.util.logging.Logger; 

public class PaypalStrategy implements PaymentStrategy {
    private String email; 
    private String password; 
    public PaypalStrategy(String e, String pass){
        this.email = e ; 
        this.password = pass ; 
    }

    @Override
    public void pay(int amount) {
        Logger logger = Logger.getLogger(CreditCardStrategy.class.getName()); 
        logger.log(Level.INFO, "Paying $" + amount + " with " + email + "'s paypal account.");
    }



    
}
