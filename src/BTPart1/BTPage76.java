public class BTPage76 {

    public static void main(String[] args) {
        Console c = new Console();

        // Ví dụ 1: in xâu với các ký tự đảo ngược
        c.println("Nhập một chuỗi:");
        String line = c.readLine();
        c.println("Chuỗi sau khi đảo ngược:");
        for (int i = line.length() - 1; i >= 0; i--)
            c.print(line.charAt(i));
        c.println();

        // Ví dụ 2: một phương thức, nó nhận một xâu biểu diễn một số nguyên và trả về một giá trị integer
        c.println("Nhập một số nguyên:");
        String x = c.readLine();
        c.println("Giá trị integer tương ứng: " + valueEnter(x));
    }

    static int valueEnter(String x) {
        int value = 0;
        for (int i = 0; i < x.length(); i++)
            value = value * 10 + (x.charAt(i) - '0');
        return value;
    }

}
