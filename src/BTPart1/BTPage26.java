public class BTPage26 {
    public static void main(String[] args) {
        Console c = new Console();

        c.println("Which year were you born ?");
        int year = c.readInt();

        c.println("Which month were you born ?");
        int month = c.readInt();

        c.println("Which day were you born ?");
        int day = c.readInt();

        int livedDays = calculateDays(year, month, day);
        c.println("You have lived almost " + livedDays + " days");
    }

    private static int calculateDays(int year, int month, int day) {
        int YEAR_DAYS = 365;
        int MONTH_DAYS = 30;
        int END_YEAR = 2023;
        int END_MONTH = 9;
        int END_DAY = 26;

        int totalDays = (END_YEAR - year) * YEAR_DAYS;
        totalDays += (END_MONTH - month) * MONTH_DAYS;
        totalDays += END_DAY - day;

        return totalDays;
    }
}
