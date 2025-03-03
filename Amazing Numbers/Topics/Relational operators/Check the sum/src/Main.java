import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int sum = 20;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(checkSumOfPair(a, b, c, sum));
    }

    public static boolean checkSumOfPair(int a, int b, int c, int sumOfPair) {
        return a + b == sumOfPair || a + c == sumOfPair || b + c == sumOfPair;
    }
}