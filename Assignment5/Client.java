package Assignment5;

import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

import Assignment5.Class.*;
import Assignment5.Factory.ReceiptFactory;

public class Client {
    public static void main(String[] args) {
        int key;
        Calendar date;
        PurchasedItems purchasedItems = new PurchasedItems();
        ReceiptFactory factory = new ReceiptFactory();
        Scanner input = new Scanner(System.in);
        boolean stats = true;
        do {
            System.out.println("Select an option from the list below:");
            menu();
            key = input.nextInt();

            switch (key) {
                case 1:
                    System.out.println("Date entry: auto or manual?");
                    flushInput(input);
                    String selection = input.next();
                    if (selection.equalsIgnoreCase("auto")) {
                        date = Calendar.getInstance();
                        printDate(date);
                    } else {
                        date = Calendar.getInstance();
                        System.out.println("Enter year:");
                        flushInput(input);
                        int year = input.nextInt();
                        date.set(Calendar.YEAR, year);
                        System.out.println("Enter month:");
                        flushInput(input);
                        int month = input.nextInt();
                        date.set(Calendar.MONTH, month);
                        System.out.println("Enter day:");
                        flushInput(input);
                        int day = input.nextInt();
                        date.set(Calendar.DAY_OF_MONTH, day);
                        System.out.println("Enter hour:");
                        flushInput(input);
                        int hour = input.nextInt();
                        date.set(Calendar.HOUR, hour);
                        System.out.println("Enter minutes:");
                        flushInput(input);
                        int minute = input.nextInt();
                        date.set(Calendar.MINUTE, minute);
                        printDate(date);
                    }
                    break;
                case 2:
                    System.out.println("What would you like to purchase? Enter code:");
                    String code = input.nextLine();
                    System.out.println("Enter description:");
                    String description = input.nextLine();
                    System.out.println("Enter price:");
                    String price = input.nextLine();
                    purchasedItems.addItem(new StoreItem(code, description, price));
                    break;
                case 3:

                    break;
                default:
                    stats = false;
                    break;
            }
        } while (stats);
    }

    private static void printDate(Calendar date) {
        String currently = "Date: ";
        String ampm;
        currently = currently.concat(Integer.toString(date.get(Calendar.MONTH)+1)); 
        currently = currently.concat("/"); 
        currently = currently.concat(Integer.toString(date.get(Calendar.DAY_OF_MONTH))); 
        currently = currently.concat("/");
        currently = currently.concat(Integer.toString(date.get(Calendar.YEAR)));
        currently = currently.concat(" ");
        currently = currently.concat(Integer.toString(date.get(Calendar.HOUR_OF_DAY)-12));
        currently = currently.concat(":");
        currently = currently.concat(Integer.toString(date.get(Calendar.MINUTE))); 
        if (date.get(Calendar.HOUR_OF_DAY) > 12) {
            ampm = " PM";
        } else {
            ampm = " AM";
        }
        currently = currently.concat(ampm);
        System.out.println(currently);
    }

    private static void flushInput(Scanner input) {
        input.findInLine(Pattern.compile("\n"));
    }

    private static void menu() {
        System.out.println("1: Start New Recipt");
        System.out.println("2: Add Items");
        System.out.println("3: Display Recipt");
        System.out.println("Enter an option other than 1, 2, or 3 to Exit");
    }
}