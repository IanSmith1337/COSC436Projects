package Assignment6.Commands;
import Assignment6.*;


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





