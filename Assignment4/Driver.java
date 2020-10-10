package Assignment4;

import java.util.*;

public class Driver {
    
    public static void main(String[] args) {
        Menu eatAtJoesMenu = new Menu();
        eatAtJoesMenu.add("Lobster Dinner", eatAtJoesMenu.MAIN_DISH, false, 24.99);
        eatAtJoesMenu.add("Rice Pudding", eatAtJoesMenu.DESSERT, false, 3.50);
        runIterator(eatAtJoesMenu);
    }

    private static void runIterator(Menu menu){
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose an option:");
        System.out.println("1 – Display all menu items");
        System.out.println("2 – Display all appetizers");
        System.out.println("3 – Display all main dishes");
        System.out.println("4 – Display all desserts");
        System.out.println("5 – Display all hearty healthy items");
        System.out.println("6 – Display all main dishes under a specified price");
        System.out.println("0 – Quit");

        int option = input.nextInt();
        do{
            
            MenuItem dish = null;
            
            switch (option)
            {
                case 1: 
                Iterator<MenuItem> iterator = menu.iterator();

                while(iterator.hasNext()){
                    dish = iterator.next();
                    System.out.println(dish.itemName + ", $" + dish.price);
                }
                break;

                case 2:
                Iterator<MenuItem> iterator2 = menu.iterator(2, 0);

                while(iterator2.hasNext()){
                    dish = iterator2.next();
                    System.out.println(dish.itemName + ", $" + dish.price);
                }
                break;

                case 3: 
                Iterator<MenuItem> iterator3 = menu.iterator(3, 0);

                while(iterator3.hasNext()){
                    dish = iterator3.next();
                    System.out.println(dish.itemName + ", $" + dish.price);
                }
                break;

                case 4: 
                Iterator<MenuItem> iterator4 = menu.iterator(4, 0);

                while(iterator4.hasNext()){
                    dish = iterator4.next();
                    System.out.println(dish.itemName + ", $" + dish.price);
                }
                break;

                case 5: 
                Iterator<MenuItem> iterator5 = menu.iterator(5, 0);

                while(iterator5.hasNext()){
                    dish = iterator5.next();
                    System.out.println(dish.itemName + ", $" + dish.price);
                }
                break;

                case 6: 
                Iterator<MenuItem> iterator6 = menu.iterator(6, 5);

                while(iterator6.hasNext()){
                    dish = iterator6.next();
                    System.out.println(dish.itemName + ", $" + dish.price);
                }
                break;
                
                default:
                System.exit(2);
            }
        System.out.println("---------------------------------");
        System.out.println("Please choose an option:");
        System.out.println("1 – Display all menu items");
        System.out.println("2 – Display all appetizers");
        System.out.println("3 – Display all main dishes");
        System.out.println("4 – Display all desserts");
        System.out.println("5 – Display all hearty healthy items");
        System.out.println("6 – Display all main dishes under a specified price");
        System.out.println("0 – Quit");


        option = input.nextInt();
        } while(option != 0);
    }
}
