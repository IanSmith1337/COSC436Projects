package ICE15;

import java.util.logging.Logger;
import java.util.logging.Level;

public class Surveillance implements AlarmListener{
    @Override
    public void alarm() {
        Logger log = Logger.getLogger(this.getClass().getName());
        log.log(Level.INFO, "Surveillance – by the numbers:");
    }
}
