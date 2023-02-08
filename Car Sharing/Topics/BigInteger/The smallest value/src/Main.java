import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger m = new BigInteger(scanner.nextLine().trim());
        long result = 0;
        for (long i = 0; i < Long.MAX_VALUE; i++) {
            if (m.compareTo(factorialOfBigIntegerResult(i)) <= 0) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }

    public static BigInteger factorialOfBigIntegerResult(long n) {
        BigInteger result = BigInteger.ONE;
        for (long i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}