package ICE18.factories;
import ICE18.interfaces.*;
import ICE18.shapeSubs.*;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		if (shape.equals("CIRCLE")){
			return new Circle();
		}else if (shape.equals("SQUARE")){
			return new Square(); 
		}else if (shape.equals("RECTANGLE")) {
			return new Rectangle(); 
		} else {
			return null;
		}
	}
    
    
}
