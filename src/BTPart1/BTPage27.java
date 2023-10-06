public class BTPage27 {
    public static void main(String[] args) {
        Console c = new Console();

        c.println("Which year were you born ?");
        int birthYear = c.readInt();

        c.println("Which month were you born ?");
        int birthMonth = c.readInt();

        c.println("Which day were you born ?");
        int birthDay = c.readInt();

        c.println("Which year is this year ?");
        int currentYear = c.readInt();

        c.println("Which month is this month ?");
        int currentMonth = c.readInt();

        c.println("Which day is today ?");
        int currentDay = c.readInt();

        int livedDays = calculateDays(birthYear, birthMonth, birthDay, currentYear, currentMonth, currentDay);
        c.println("You have lived about " + livedDays + " days");
    }

    private static int calculateDays(int birthYear, int birthMonth, int birthDay, int currentYear, int currentMonth, int currentDay) {
        int YEAR_DAYS = 365;
        int MONTH_DAYS = 30;

        int totalDays = (currentYear - birthYear) * YEAR_DAYS;
        totalDays += (currentMonth - birthMonth) * MONTH_DAYS;
        totalDays += currentDay - birthDay;

        return totalDays;
    }
}
