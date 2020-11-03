package ICE15;

import java.util.logging.*;

class CheckList {
    // Template Method design pattern
    public void byTheNumbers() {
        localize();
        isolate();
        identify();
    }

    protected void localize() {
        Logger log = Logger.getLogger(this.getClass().getName());
        log.log(Level.INFO, "   establish a perimeter");
    }

    protected void isolate() {
        Logger log = Logger.getLogger(this.getClass().getName());
        log.log(Level.INFO, "   isolate the grid");
    }

    protected void identify() {
        Logger log = Logger.getLogger(this.getClass().getName());
        log.log(Level.INFO, "   identify the source");
    }
}