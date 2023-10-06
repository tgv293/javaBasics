public class BTPage58 {
    public static void main(String[] args) {
        int a = 0, b = 0, sum = 0, num;
        int count = 0;
        int sumLess50 = 0, countLess50 = 0;
        int sumGreater100 = 0, countGreater100 = 0;
        int sumBetween50And100 = 0, countBetween50And100 = 0;
        Console c = new Console();

        while (true) {
            num = c.readInt();
            if (num == -1) break;
            count++;
            if (num < 50) {
                sumLess50 += num;
                countLess50++;
            } else if (num > 100) {
                sumGreater100 += num;
                countGreater100++;
            } else {
                sumBetween50And100 += num;
                countBetween50And100++;
            }

            if (num %2 == 0) {
                sum += num;
                a++;
            } else {
                sum += num;
                b++;
            }
        }

        c.println("Số lượng số được nhập vào: " + count);
        c.println("Giá trị trung bình của các số bé hơn 50: " + (countLess50 > 0 ? ((double)sumLess50 / countLess50) : "Không có số nào bé hơn 50"));
        c.println("Giá trị trung bình của các số lớn hơn 100: " + (countGreater100 > 0 ? ((double)sumGreater100 / countGreater100) : "Không có số nào lớn hơn 100"));
        c.println("Giá trị trung bình của các số trong đoạn từ 50 đến 100: " + (countBetween50And100 > 0 ? ((double)sumBetween50And100 / countBetween50And100) : "Không có số nào trong đoạn từ 50 đến 100"));
    }
}
