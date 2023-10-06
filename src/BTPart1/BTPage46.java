public class BTPage46 {
    public static void main(String[] args) {
        Console c = new Console();

        c.println("Nhập số phút gọi điện thoại: ");
        int minutes = c.readInt();

        int totalCost = calculateCost(minutes);
        c.println("Tổng tiền điện thoại là: " + totalCost + " đ");
    }

    private static int calculateCost(int minutes) {
        int MONTHLY_FEE = 27000;
        int FIRST_200_MINUTES_RATE = 120;
        int NEXT_200_MINUTES_RATE = 80;
        int REMAINING_MINUTES_RATE = 40;

        int totalCost = MONTHLY_FEE;

        if (minutes > 400) {
            totalCost += (minutes - 400) * REMAINING_MINUTES_RATE;
            minutes = 400;
        }

        if (minutes > 200) {
            totalCost += (minutes - 200) * NEXT_200_MINUTES_RATE;
            minutes = 200;
        }

        totalCost += minutes * FIRST_200_MINUTES_RATE;

        return totalCost;
    }
}
