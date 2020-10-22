package ICE12;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TextField implements Widget {
    private int width;
    private int length;

    public TextField(int w, int l){
        this.width = w;
        this.length = l;
    }

    @Override
    public void draw() {
        String sWidth = Integer.toString(width);
        String sLength = Integer.toString(length);
        Logger log = Logger.getLogger(this.getClass().getName());
        log.log(Level.INFO, "This is TextField");
        log.log(Level.INFO, sWidth);
        log.log(Level.INFO, sLength);
    }
}
