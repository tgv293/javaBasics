public class Programm8 {
    public static void main(String[] args) {
        Console c = new Console();
        c.println("Enter the value to pay: ");
        int toPay = c.readInt();
        c.println("Enter the money given by the customer: ");
        int theMoney = c.readInt();

        if (theMoney < toPay) {
            c.println("The money is not enough to pay the bill!");
        } else if (theMoney == toPay) {
            c.println("The money is right, no change.");
        } else {
            int change = theMoney - toPay;

            int[] denominations = {5000, 1000, 500, 100, 50, 10, 5, 1};

            for (int denomination : denominations) {
                int count = change / denomination;
                if (count != 0) {
                    c.println("Give " + count + " of " + denomination);
                    change = change % denomination;
                }
            }
        }
    }
}
