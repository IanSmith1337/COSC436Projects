package Assignment6.CommandPattern.Commands;
import Assignment6.*;
import Assignment6.CommandPattern.Classes.*;


public class GetTab implements Command {

    private Aggregator ag; 

    public GetTab(Aggregator ag) {
        this.ag = ag; 
    }

    @Override
    public Tab execute() {
        return new Tab(ag.getMenu(), ag.getOrder()); 
    }
}





