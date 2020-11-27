package Assignment6; 

public class cmdGetMenu {
    private Aggregator ag; 

    public cmdGetMenu(Aggregator ag) {
        this.ag = ag; 
    }

    public Menu execute() {
        return ag.getMenu(); 
    }

    
}
