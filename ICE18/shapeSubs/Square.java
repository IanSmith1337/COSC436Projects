package ICE18.shapeSubs;

import java.util.logging.Logger;

import ICE18.interfaces.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        Logger log = Logger.getLogger(Square.class.getName());
        log.info("Inside Square.draw() method");
    }
}