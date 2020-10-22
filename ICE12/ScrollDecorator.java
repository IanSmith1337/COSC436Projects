package ICE12;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ScrollDecorator extends Decorator {

    public ScrollDecorator(Widget w) {
        super(w);
    }

    @Override
    public void draw() {
        super.draw();
        Logger log = Logger.getLogger(this.getClass().getName());
        log.log(Level.INFO, "\n");
        log.log(Level.INFO, "ScrollDecorator");
        log.log(Level.INFO, "\n");
    }
    
}
