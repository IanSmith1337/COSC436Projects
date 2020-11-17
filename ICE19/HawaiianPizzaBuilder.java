package ICE19;


public class HawaiianPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		pizza.setDough("Thin Crust");
	}

	@Override
	public void buildSauce() {
        
        pizza.setSauce("Red Sauce");
		
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Pineapple and Ham");
	}
    
}
