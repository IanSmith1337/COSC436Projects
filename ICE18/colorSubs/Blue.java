package ICE18.colorSubs;

import java.util.logging.Logger;

import ICE18.interfaces.Color;

public class Blue implements Color {
    @Override
    public void fill(){
        Logger log = Logger.getLogger(Blue.class.getName());
        log.info("inside Blue.fill() method");
    }
    
}
