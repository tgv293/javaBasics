import java.math.BigInteger;

public class ProgramCombinations2 {
    public static void main(String[] args) {
        int n = 10;
        int k = 5;
        BigInteger result = combination(n, k);
        System.out.println("C(" + n + ", " + k + ") = " + result);
    }

    public static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static BigInteger combination(int n, int k) {
        return factorial(n).divide(factorial(k).multiply(factorial(n - k)));
    }
}

