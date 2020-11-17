package Assignment5;

import Assignment5.Class.*;

public class Client {
    public static void main(String[] args) {
        
        String date; 
        PurchasedItems purchasedItems  = new PurchasedItems(); 
        ReceiptFactory factory = new ReciptFactory();
        boolean stats = true; 

        



        while(stats){
            menu(); 
        switch (key) {
            case 1: 
                
                break;
            case 2: 

                break; 
            case 3: 

                break; 
            
        
            default:
                stats = false ; 
                break;
        }
    }



    }

	private static void menu() {
        System.out.println("1: Start New Recipt ");
        System.out.println("2: Add items");
        System.out.println("3 Display Recipt");
        System.out.println("Press any Key other than 1, 2 and 3 to Exit ");

	}
    
}




