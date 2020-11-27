package Assignment6; 

public class cmdSubmitOrder {
    private Aggregator ag; 

    public cmdSubmitOrder(Aggregator ag) {
        this.ag = ag; 
    }

    public Orders execute() {
        return ag.getOrder(); 
    }

    
}
