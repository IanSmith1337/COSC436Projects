package Assignment6;

public class Invoker {

   
    Aggregator agObj = new Aggregator();

    public Menu getMenu() {
        return new cmdGetMenu(agObj).execute();
        
    }

    public Orders getOrders() {
		return new cmdSubmitOrder(agObj).execute();

       // return; 

    }

    public Tab getTab() {

        double totalCost = 0 ; 



        return null; 

         //return

    }
       
    

    
}

// TODO: A tab will be constructed from the Tab class containing all of the ordered items, returned as an array of strings
// for the user interface to display. Note that a tab needs information from both the Menu 
//and the Orders objects. (The Orders object indicates what menu items were ordered, 
//and the Menu class has the description of each item to include in the Tab.)