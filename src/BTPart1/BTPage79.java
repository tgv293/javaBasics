public class BTPage79 {
    public static void main(String[] args) {
        Console c = new Console();
        int totalWords = 0;

        for (int i = 0; i < 10; i++) {
            c.println("Nhập chuỗi thứ " + (i + 1) + ":");
            String line = c.readLine();
            totalWords += countWords(line);
        }

        c.println("Tổng số từ trong 10 chuỗi: " + totalWords);
    }

    static int countWords(String str) {
        String trim = str.trim();
        if (trim.isEmpty())
            return 0;
        return trim.split("\\s+").length; // separate string around spaces
    }
}
