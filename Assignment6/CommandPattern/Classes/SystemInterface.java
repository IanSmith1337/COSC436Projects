package Assignment6.CommandPattern.Classes;

import Assignment6.Menu;
import Assignment6.Orders;
import Assignment6.Tab;

public class SystemInterface {

    private static Invoker invoke = new Invoker();

    public static Menu getMenu() {
        return invoke.getMenu();
    }

    public static Tab getTab() {
        return invoke.getTab(); 

    }

	public static Orders getOrders() {
		return invoke.getOrders();
	}


}
