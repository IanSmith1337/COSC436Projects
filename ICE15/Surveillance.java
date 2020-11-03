package ICE15;

import java.util.logging.*;

public class Surveillance extends CheckList implements AlarmListener{
    @Override
    public void alarm() {
        Logger log = Logger.getLogger(this.getClass().getName());
        log.log(Level.INFO, "Surveillance – by the numbers:");
        byTheNumbers();
    }

    @Override
    protected void isolate() {
        Logger log = Logger.getLogger(this.getClass().getName());
        log.log(Level.INFO, "   train the cameras");
    }

}
