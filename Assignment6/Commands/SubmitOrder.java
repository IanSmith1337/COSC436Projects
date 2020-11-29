package Assignment6.Commands; 
import Assignment6.*;

public class SubmitOrder implements Command {
    private Aggregator ag; 

    public SubmitOrder(Aggregator ag) {
        this.ag = ag; 
    }

    @Override
    public Orders execute() {
        return ag.getOrder(); 
    }

}
