import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        scanner.close();
        int firstDigit = inputNumber / 100;
        int secondDigit = (inputNumber % 100) / 10;
        int thirdDigit = inputNumber % 10;
        int result = thirdDigit * 100 + secondDigit * 10 + firstDigit;
        System.out.println(result);
    }
}