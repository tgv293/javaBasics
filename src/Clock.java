public class Clock {
    int minutes;
    int seconds;
    int hours;

    Clock() {
        minutes = 0;
        seconds = 0;
        hours = 0;
    }

    Clock(int h, int m, int s) {
        minutes = m;
        seconds = s;
        hours = h;
    }

    public void setTime(int h, int m, int s) {
        minutes = m;
        seconds = s;
        hours = h;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public String getTime() {
        return hours + ":" + minutes + ":" + seconds;
    }

    public void addSeconds(int x) {
        // Tính tổng số giây hiện tại và thêm x giây
        int totalSecs = totalSeconds() + x;

        // Cập nhật giờ, phút và giây dựa trên tổng số giây
        hours = totalSecs / 3600;
        totalSecs %= 3600;

        minutes = totalSecs / 60 ;
        seconds = totalSecs % 60;

        // Nếu giờ >= 24, đặt lại về 0
        if (hours >= 24) {
            hours = 0;
        }
    }

    public int totalSeconds() {
        // Tính tổng số giây từ thời điểm bắt đầu ngày mới (00:00:00) cho đến thời gian hiện tại
        return hours * 3600 + minutes * 60 + seconds;
    }
}
