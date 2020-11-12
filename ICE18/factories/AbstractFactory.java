package ICE18.factories;
import ICE18.interfaces.*;


public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
