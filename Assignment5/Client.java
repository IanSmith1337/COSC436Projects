package Assignment5;

import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

import Assignment5.Class.*;
import Assignment5.Factory.ReceiptFactory;
import Assignment5.interfaces.Receipt;

public class Client {
    public static void main(String[] args) {
        int key;
        Calendar date;
        PurchasedItems purchasedItems = new PurchasedItems();
        ReceiptFactory factory;
        try {
            date = Calendar.getInstance();
            factory = new ReceiptFactory();
            Scanner input = new Scanner(System.in);
            boolean stats = true;
            do {
                System.out.println("Select an option from the list below:");
                menu();
                flushInput(input);
                key = input.nextInt();
                switch (key) {
                    case 1:
                        System.out.println("Date entry: auto or manual?");
                        flushInput(input);
                        String selection = input.next();
                        if (selection.equalsIgnoreCase("auto")) {
                            date = Calendar.getInstance();
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
                        }
                        break;
                    case 2:
                        System.out.println("What would you like to purchase? Enter code:");
                        flushInput(input);
                        String code = input.next();
                        System.out.println("Enter description (Use -s for spaces):");
                        flushInput(input);
                        String description = input.next();
                        description = description.replace("-", " ");
                        System.out.println("Enter price:");
                        flushInput(input);
                        String price = input.next();
                        purchasedItems.addItem(new StoreItem(code, description, price));
                        break;
                    case 3:
                        Receipt receipt = factory.getReceipt(purchasedItems, date);
                        receipt.prtReceipt();
                        stats = false;
                        break;
                    default:
                        stats = false;
                        break;
                }
            } while (stats);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
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