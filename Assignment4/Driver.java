package Assignment4;

/*
Assignment 4:

MenuItem: Prabhat, Ian
Menu: Ian, Melissa, Prabhat
Driver: Melissa, Ian, Prabhat

Proudly produced with lots of pair programming, and copious amounts of BIG SALAD. LOL

*/

import java.util.*;

public class Driver {
    
    public static void main(String[] args) {
        Menu myRestaurantAcademia = new Menu();
        myRestaurantAcademia.add("Lobster Dinner", myRestaurantAcademia.MAIN_DISH, false, 24.99);
        myRestaurantAcademia.add("Rice Pudding", myRestaurantAcademia.DESSERT, false, 3.50);
        myRestaurantAcademia.add("Mac and Cheese", myRestaurantAcademia.MAIN_DISH, false, 10.99);
        myRestaurantAcademia.add("Big Salad", myRestaurantAcademia.MAIN_DISH, true, 87.66);
        myRestaurantAcademia.add("Salad", myRestaurantAcademia.APPETIZERS, true, 5.99);
        myRestaurantAcademia.add("Garlic Naan", myRestaurantAcademia.APPETIZERS, true, 3.99);
        myRestaurantAcademia.add("Sushi", myRestaurantAcademia.APPETIZERS, true, 19.99);
        runIterator(myRestaurantAcademia);
    }

    private static void runIterator(Menu menu) {
        Scanner input = new Scanner(System.in);
        int option = iteratorSelect(input);
        do{
            switch (option)
            {
                case 1: 
                    launchIterator(menu);
                    break;

                case 2:
                    launchIterator2(menu);
                    break;

                case 3: 
                    launchIterator3(menu);
                    break;

                case 4: 
                    launchIterator4(menu);
                    break;

                case 5: 
                    launchIterator5(menu);
                    break;

                case 6:
                    double price = getPrice(input);
                    launchIterator6(menu, price);
                    break;
                
                default:
                    System.out.println("Error: Selection not recognized, shutting down...");
                    System.exit(2);
            }
            option = iteratorSelect(input);
        } while(option != 0);
        input.close();
    }

    private static double getPrice(Scanner i) {
        System.out.println("Please enter price: ");
        return i.nextDouble();
         
    }

    private static void launchIterator6(Menu menu, Double p) {
        MenuItem dish;
        Iterator<MenuItem> iterator6 = menu.iterator(3);

        while(iterator6.hasNext()){
            dish = iterator6.next();
            if(dish.price > p) {
                System.out.println("Dish omitted, price too high.");     
            } else {
                String out = dish.itemName + ", $" + String.format("%.2f", dish.price);
                System.out.println(out);
            }
        }
    }

    private static void launchIterator5(Menu menu) {
        MenuItem dish;
        Iterator<MenuItem> iterator5 = menu.iterator(5);

        while(iterator5.hasNext()){
            dish = iterator5.next();
            String out = dish.itemName + ", $" + String.format("%.2f", dish.price);
            System.out.println(out);
        }
    }

    private static void launchIterator4(Menu menu) {
        MenuItem dish;
        Iterator<MenuItem> iterator4 = menu.iterator(4);

        while(iterator4.hasNext()){
            dish = iterator4.next();
            String out = dish.itemName + ", $" + String.format("%.2f", dish.price);
            System.out.println(out);
        }
    }

    private static void launchIterator3(Menu menu) {
        MenuItem dish;
        Iterator<MenuItem> iterator3 = menu.iterator(3);

        while(iterator3.hasNext()){
            dish = iterator3.next();
            String out = dish.itemName + ", $" + String.format("%.2f", dish.price);
            System.out.println(out);
        }
    }

    private static void launchIterator2(Menu menu) {
        MenuItem dish;
        Iterator<MenuItem> iterator2 = menu.iterator(2);

        while(iterator2.hasNext()){
            dish = iterator2.next();
            String out = dish.itemName + ", $" + String.format("%.2f", dish.price);
            System.out.println(out);
        }
    }

    private static void launchIterator(Menu menu) {
        MenuItem dish;
        Iterator<MenuItem> iterator = menu.iterator();

        while(iterator.hasNext()){
            dish = iterator.next();
            String out = dish.itemName + ", $" + String.format("%.2f", dish.price);
            System.out.println(out);
        }
    }

    private static int iteratorSelect(Scanner input) {
        System.out.println("Please choose an option:");
        System.out.println("1 – Display all menu items");
        System.out.println("2 – Display all appetizers");
        System.out.println("3 – Display all main dishes");
        System.out.println("4 – Display all desserts");
        System.out.println("5 – Display all hearty healthy items");
        System.out.println("6 – Display all main dishes under a specified price");
        System.out.println("0 – Quit");

        int option = input.nextInt();
        return option;
    }
}
