package ICE19;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        System.out.println("Waiter: can I get you the SPICY pizza? Or the HAWAIIAN pizza?");

        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        if(line.equalsIgnoreCase("hawaiian")){
            waiter.setPizzaBuilder(new HawaiianPizzaBuilder());
        }

        if (line.equalsIgnoreCase("spicy")) {
            waiter.setPizzaBuilder(new SpicyPizzaBuilder());
        }

        waiter.constructPizza();
        System.out.println("Here is your " + waiter.getPizza().getDough() + " pizza with " + waiter.getPizza().getSauce() + " topped with " + waiter.getPizza().getTopping() + ". Have a nice day!");
        input.close();
        System.exit(0);
    }
}
