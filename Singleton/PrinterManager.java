package Singleton;

public class PrinterManager {

    // private constructor
    private PrinterManager(int numPrinter) {
        printers = new Printer[numPrinter];
        // init
        for(int i = 0; i < numPrinter; i++) {
            printers[i] = new Printer();
        }
    }

    //return singleton instance
    public static PrinterManager getInstance(){
        //no existing
        //create new
        if (instance == null){
            instance = new PrinterManager(8);
        }
        //if one exists
        //return it
        return instance;
    }

    // assign job to printer
    public String assignJob(String printJob) {
        // check availability
        for (Printer printer : printers) {
            if(printer.isBusy() == false) {
                printer.setBusy(true);
                printer.setPrintJob(printJob);
                return "Job is assigned";
            }
        }

        //no available printy bois
        return "Printy bois are busy doing printy stuff, come back in a few minutes.";
    }

    public void showStatus()
    {
        for(int i = 0; i < printers.length; i++
        {
            System.out.println("Status of printer " +i+ ":");
            if(printers[i].isBusy) {
                System.out.println("Busy");
            } else {
                System.out.println("Available");
            }
        }
    }
}
