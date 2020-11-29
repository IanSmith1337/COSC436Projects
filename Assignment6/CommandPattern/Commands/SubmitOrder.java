package Assignment6.CommandPattern.Commands;

import Assignment6.*;
import Assignment6.CommandPattern.Classes.*;

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
