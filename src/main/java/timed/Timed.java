package timed;

public class Timed {
    private int hour;
    private int minute;

    public Timed() {

    }
    public Timed(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public void setTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int sub(Timed time) {
        return getMinute() - time.getMinute();
    }
}
