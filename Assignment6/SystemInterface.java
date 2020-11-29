package Assignment6;

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
