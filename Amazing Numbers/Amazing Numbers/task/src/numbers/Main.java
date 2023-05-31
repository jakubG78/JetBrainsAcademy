package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println("\nSupported requests:\n" +
                "- enter a natural number to know its properties;\n" +
                "- enter 0 to exit.");
        while (true) {
            System.out.print("\nEnter a request: > ");
            long inputIntegerNumber = scanner.nextLong();
            if (inputIntegerNumber == 0) {
                System.out.println("\nGoodbye!");
                break;
            }

            if (inputIntegerNumber <= 0) {
                System.out.println("\nThe first parameter should be a natural number or zero.");
                continue;
            }
            System.out.printf("\nProperties of %d\n", inputIntegerNumber);
            System.out.println("        even: " + isEvenNumber(inputIntegerNumber));
            System.out.println("         odd: " + !isEvenNumber(inputIntegerNumber));
            System.out.println("        buzz: " + isBuzzNumber(inputIntegerNumber));
            System.out.println("        duck: " + isDuckNumber(inputIntegerNumber));
            System.out.println(" palindromic: " + isPalindromicNumber(inputIntegerNumber));
        }
    }

    private static boolean isEvenNumber(long inputIntegerNumber) {
        return inputIntegerNumber % 2 == 0;
    }

    private static boolean isBuzzNumber(long inputIntegerNumber) {
        return inputIntegerNumber % 7 == 0 || inputIntegerNumber % 10 == 7;
    }

    private static boolean isDuckNumber(long inputIntegerNumber) {
        while (inputIntegerNumber != 0) {
            if ((inputIntegerNumber % 10) == 0) {
                return true;
            }
            inputIntegerNumber = inputIntegerNumber / 10;
        }
        return false;
    }

    private static boolean isPalindromicNumber(long inputIntegerNumber) {
        long num = inputIntegerNumber;
        long reversedNum = 0;
        long remainder;

        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        return inputIntegerNumber == reversedNum;
    }
}