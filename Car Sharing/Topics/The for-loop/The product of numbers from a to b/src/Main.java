import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowerLimit = scanner.nextInt();
        int upperLimit = scanner.nextInt();
        long result = 1;
        for (int i = lowerLimit; i < upperLimit; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}