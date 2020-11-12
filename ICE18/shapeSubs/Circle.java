package ICE18.shapeSubs;

import java.util.logging.Logger;

import ICE18.interfaces.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        Logger log = Logger.getLogger(Circle.class.getName());
        log.info("Inside Cicle.draw() method");
    }
}
