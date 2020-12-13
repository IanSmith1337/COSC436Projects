package Assignment6.CommandPattern.Classes;

import Assignment6.*;
import Assignment6.CommandPattern.Commands.*;

public class Invoker {

    Aggregator agObj = new Aggregator();

    public Menu getMenu() {
        return new GetMenu(agObj).execute();
    }

    public Orders getOrders() {
		return new SubmitOrder(agObj).execute();
    }

    public Tab getTab() {
        return new GetTab(agObj).execute(); 
    }
    
}