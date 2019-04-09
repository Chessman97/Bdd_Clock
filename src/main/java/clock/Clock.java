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

    public void setSignal(Timed timed) {
        signalTime = timed;
    }

    public void setAlarm(int alarmed) {
        this.alarmed = alarmed;
    }

    public boolean signalAlarm() {
         return timed.sub(signalTime) < alarmed && timed.sub(signalTime) >= 0;
    }
}
