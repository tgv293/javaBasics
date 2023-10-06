import java.util.Arrays;

public class BTPage65 {
    public static void main(String[] args) {
        Console c = new Console();
        int[] array = new int[20];
        int sum = 0;

        c.println("Nhập vào 20 số nguyên:");
        for (int i = 0; i < 20; i++) {
            array[i] = c.readInt();
            sum += array[i];
        }

        double average = sum / 20.0;
        c.println("Giá trị trung bình của các phần tử trong dãy là: " + average);

        c.println("Các phần tử có giá trị bé hơn giá trị trung bình của các phần tử trong dãy:");
        for (int i = 0; i < 20; i++) {
            if (array[i] < average) {
                c.println(array[i]);
            }
        }

        Arrays.sort(array);
        c.println("Dãy sau khi sắp xếp theo chiều tăng dần:");
        for (int i = 0; i < 20; i++) {
            c.println(array[i]);
        }
    }
}
