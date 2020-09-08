package Singleton;

public class Client {

    public static void main(String[] args) {
        //Init instance
        PrinterManager bob = PrinterManager.getInstance();
        //give bob something to do
        bob.assignJob("Print Something");
        bob.assignJob("Print another thing LEL");
        //Show status
        System.out.println("Bob Status:");
        bob.showStatus();
        System.out.println("");
        // check to see if you can get another instance
        PrinterManager harold = PrinterManager.getInstance();
        // Show status
        System.out.println("Harold Status:");
        harold.showStatus();
        System.out.println("");
    }

}
