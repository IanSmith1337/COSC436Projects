package ICE18.colorSubs;

import java.util.logging.Logger;

import ICE18.interfaces.Color;

public class Red implements Color {
    @Override
    public void fill(){
        Logger log = Logger.getLogger(Red.class.getName());
        log.info("inside Red.fill() method");
    }
    
}
