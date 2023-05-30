package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a natural number:");
        Scanner scanner = new Scanner(System.in);
        int inputIntegerNumber = scanner.nextInt();
        while (true) {
            if (inputIntegerNumber <= 0) {
                System.out.println("This number is not natural!");
                break;
            }
            System.out.printf("Properties of %d\n", inputIntegerNumber);
            System.out.println("        even: " + isEvenNumber(inputIntegerNumber));
            System.out.println("        odd: " + !isEvenNumber(inputIntegerNumber));
            System.out.println("        buzz: " + isBuzzNumber(inputIntegerNumber));
            System.out.println("        duck: " + isDuckNumber(inputIntegerNumber));
            break;
        }
    }

    private static boolean isEvenNumber(int inputIntegerNumber) {
        return inputIntegerNumber % 2 == 0;
    }

    private static boolean isBuzzNumber(int inputIntegerNumber) {
        return inputIntegerNumber % 7 == 0 || inputIntegerNumber % 10 == 7;
    }

    private static boolean isDuckNumber(int inputIntegerNumber) {
        while (inputIntegerNumber != 0) {
            if ((inputIntegerNumber % 10) == 0) {
                return true;
            }
            inputIntegerNumber = inputIntegerNumber / 10;
        }
        return false;
    }
}