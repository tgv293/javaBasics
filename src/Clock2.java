public class Clock2 extends Clock {
    int day;
    int month;

    Clock2() {
        super();
        day = 0;
        month = 0;
    }

    Clock2(int h, int m, int s, int D, int M) {
        super(h, m, s);
        setDate(D, M);
    }

    public void setDate(int D, int M) {
        day = D;
        month = M;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }
}
