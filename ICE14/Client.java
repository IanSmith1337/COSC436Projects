package ICE14;

import java.util.logging.*;

public class Client {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);
        //switch on
        control.setCommand(lightsOn);
        Logger log = Logger.getLogger("Log");
        log.log(Level.INFO, light.getOnStatus());
        control.pressButton();
        log.log(Level.INFO, light.getOnStatus());
        //switch off
        control.setCommand(lightsOff);
        log.log(Level.INFO, light.getOnStatus());
        control.pressButton();
        log.log(Level.INFO, light.getOnStatus());
    }
}
