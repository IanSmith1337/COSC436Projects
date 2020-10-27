package ICE13;

import java.util.logging.Logger;
import java.util.logging.Level;

public class Gates implements AlarmListener {

    @Override
    public void alarm(){
        Logger log = Logger.getLogger(this.getClass().getName());
        log.log(Level.INFO, "*Gates close*");
    }
}
