package ICE18.colorSubs;

import java.util.logging.Logger;
import ICE18.interfaces.Color;

public class Green implements Color {
    @Override
    public void fill(){
        Logger log = Logger.getLogger(Green.class.getName());
        log.info("inside Green.fill() method");
    }
}