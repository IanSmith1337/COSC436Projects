package ICE18.shapeSubs;

import java.util.logging.Logger;

import ICE18.interfaces.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        Logger log = Logger.getLogger(Rectangle.class.getName());
        log.info("Inside Rectangle.draw() method");
    }
}
