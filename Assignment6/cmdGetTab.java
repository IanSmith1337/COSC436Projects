package Assignment6; 

public class cmdGetTab {


    private Aggregator ag; 

    public cmdGetTab(Aggregator ag) {
        this.ag = ag; 
    }

    public Tab execute() {
        return new Tab(ag.getMenu() , ag.getOrder()); 
    }
}





