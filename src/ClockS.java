public class ClockS {
    int seconds;

    ClockS() {
        seconds = 0;
    }

    ClockS(int h, int m, int s) {
        setTime(h, m, s);
    }

    public void setTime(int h, int m, int s) {
        seconds = h * 3600 + m * 60 + s;
    }

    public int getHours() {
        return seconds / 3600;
    }

    public int getMinutes() {
        return (seconds % 3600) / 60;
    }

    public int getSeconds() {
        return seconds % 60;
    }

    public String getTime() {
        return getHours() + ":" + getMinutes() + ":" + getSeconds();
    }

    public void addSeconds(int x) {
        seconds += x;

        // Nếu số giây >= 86400 (số giây trong một ngày), đặt lại về 0
        if (seconds >= 86400) {
            seconds = 0;
        }
    }

    public int totalSeconds() {
        return seconds;
    }
}
