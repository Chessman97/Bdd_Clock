package clock;

import timed.Timed;

public class Clock {
    private Timed timed;

    public Clock(Timed timed){
        this.timed = timed;
    }

    public Timed getTime() {
        return timed;
    }

    public void setSignal(Timed time) {
    }

    public void setAlarm(int i) {
    }

    public boolean signalAlarm() {
        return true;
    }
}
