package clock;

import timed.Timed;

public class Clock {
    private Timed timed;
    private int alarmed;
    private Timed signalTime;

    public Clock(Timed timed){
        this.timed = timed;
    }

    public Timed getTime() {
        return timed;
    }

    public void setSignal(Timed time) {
        signalTime = time;
    }

    public void setAlarm(int alarm) {
        alarmed = alarm;
    }

    public boolean signalAlarm() {
         return timed.sub(signalTime) < alarmed && timed.sub(signalTime) >= 0;
    }

    public void setTime(Timed time) {
        this.timed = time;
    }
}
