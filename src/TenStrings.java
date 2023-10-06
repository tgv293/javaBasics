import java.util.Scanner;

public class TenStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc vào 10 xâu từ bàn phím và đếm số từ
        for(int i = 1; i <= 10; i++) {
            System.out.println("Nhập xâu thứ " + i + ":");
            String line = scanner.nextLine();
            System.out.println("Số từ trong xâu: " + countWords(line));
        }
    }

    static int countWords(String x) {
        String[] words = x.split("\\s+");
        return words.length;
    }
}
