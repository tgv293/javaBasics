public class TestFor {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++)
//            System.out.println("5x" + i + "=" + (i * 5));
        int[] array = {-20, 19, 1, 5, -1, 27, 19, 5};
        int max;
        max = array[0];
        /*
        for (int i = 0; i < array.length; i++)
        {
            int value = array[i];
            if (value > max)
                max = value;
        }
         */
        /*
        for (int value : array) {
            if (value > max)
                max = value;
        }
         */
        System.out.println("The maximum of this array is:" + max);
    }
}
