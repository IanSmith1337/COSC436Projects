package ICE15;

import java.util.ArrayList;

public class SensorSystem {
    private ArrayList<AlarmListener> listeners = new ArrayList<>();

    public void register(AlarmListener alarmlistener) {
        listeners.add(alarmlistener);
    }
    
    public void soundTheAlarm() {
        for (AlarmListener listener: listeners){
            listener.alarm();
        }
    }
}
