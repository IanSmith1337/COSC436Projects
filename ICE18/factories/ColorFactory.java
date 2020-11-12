package ICE18.factories;
import ICE18.interfaces.*;
import ICE18.colorSubs.*;

public class ColorFactory extends AbstractFactory  {
	@Override
	public Color getColor(String color) {
		switch (color) {
			case "RED":
				return new Red();
			case "BLUE":
				return new Blue();
			case "GREEN":
				return new Green();
			default:
				return null;
		}
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}
}
}
