public class BTPage68 {
    public static int mcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return mcd(y, x % y);
        }
    }

    public static void main(String args[]) {
        Console c = new Console();
        c.print("Nhập số thứ nhất: ");
        int a = c.readInt();
        c.print("Nhập số thứ hai: ");
        int b = c.readInt();
        c.println("Ước số chung lớn nhất là " + mcd(a, b));
    }
}
