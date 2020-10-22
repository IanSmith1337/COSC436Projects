package ICE12;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BorderDecorator extends Decorator {

    public BorderDecorator(Widget w) {
        super(w);
    }

    @Override
    public void draw() {
        super.draw();
        Logger log = Logger.getLogger(this.getClass().getName());
        log.log(Level.INFO, "BorderDecorator");
    }
    
}