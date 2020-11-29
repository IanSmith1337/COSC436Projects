package Assignment6.Commands;
import Assignment6.*;

public class GetMenu  implements Command {
    private Aggregator ag; 

    public GetMenu(Aggregator ag) {
        this.ag = ag; 
    }

    @Override
    public Menu execute() {
        return ag.getMenu(); 
    }

    
}
