public class BTPage59b {
    public static void main(String[] args) {
        Console c = new Console();
        c.print("Nhập n (5 <= n <= 10): ");
        int n = c.readInt();
        double E = 0.0;
        for (int i = 1; i <= n; i++) {
            E += 1.0 / i;
        }
        c.println("E = " + E);
    }
}
