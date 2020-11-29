package Assignment6.Factory;

import Assignment6.Special;

public class SpecialFactory extends AbstractFactory {

	@Override
	public Special getSpecial(int code) {
		if(code == 1){
			int[] items = {1, 7, 9};
            return new Special("Big Salad Meal", items, "A big salad meal.", 10.00);
		}
		else if(code == 2){
			int[] items = {1, 7, 9};
            return new Special("Big Salad Meal", items, "A big salad meal.", 10.00);
		}
		else if(code == 3){
			int[] items = {1, 7, 9};
            return new Special("Big Salad Meal", items, "A big salad meal.", 10.00); 
		}
		return null;
	}
    
}


