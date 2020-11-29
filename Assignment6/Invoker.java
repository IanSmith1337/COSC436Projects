package Assignment6;

import Assignment6.Commands.*;

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

// TODO: A tab will be constructed from the Tab class containing all of the ordered items, returned as an array of strings
// for the user interface to display. Note that a tab needs information from both the Menu 
//and the Orders objects. (The Orders object indicates what menu items were ordered, 
//and the Menu class has the description of each item to include in the Tab.)