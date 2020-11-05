package ICE16;

import java.util.logging.*;

class Rectangle {
    public void draw(int x, int y, int width, int height) {
        Logger log = Logger.getLogger(this.getClass().getName());
        String string = "Rectangle with coordinate left-down point (" + x + ";" + y + "), width: " + width + ", height: " + height;
        log.log(Level.INFO, string);
    }
}