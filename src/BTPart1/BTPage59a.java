public class BTPage59a {
    public static void main(String[] args) {
        Console c = new Console();
        int sum = 0, count = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        while (true) {
            int num = c.readInt();
            if (num == 0) break;
            sum += num;
            count++;
            if (num > max) max = num;
            if (num < min) min = num;
        }
        double average = (double) sum / count;
        c.println("Trung bình cộng: " + average);
        c.println("Số lớn nhất: " + max);
        c.println("Số nhỏ nhất: " + min);
    }
}
