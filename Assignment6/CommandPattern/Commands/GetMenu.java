package Assignment6.CommandPattern.Commands;

import Assignment6.*;
import Assignment6.CommandPattern.Classes.*;
 
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
