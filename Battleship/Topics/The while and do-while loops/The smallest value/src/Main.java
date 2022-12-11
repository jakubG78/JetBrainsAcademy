import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inputLong = scanner.nextLong();
        long tempFactValue = 1;
        int searchedNumber = 1;
        while (true) {
            tempFactValue = factorial(searchedNumber);
            if (!(tempFactValue > inputLong)) {
                searchedNumber++;
            } else {
                break;
            }
        }
        System.out.println(searchedNumber);
    }

    public static long factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }
}