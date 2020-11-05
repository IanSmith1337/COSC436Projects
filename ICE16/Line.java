package ICE16;

import java.util.logging.*;

class Line {
    public void draw(int x1, int y1, int x2, int y2) {
        Logger log = Logger.getLogger(this.getClass().getName());
        String string = "Line from point A("+x1+";"+y1+"), to point B("+x2+";"+y2+")";
        log.log(Level.INFO, string);
    }
}
