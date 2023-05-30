package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a natural number:");
        Scanner scanner = new Scanner(System.in);
        int inputIntegerNumber = scanner.nextInt();
        int isBuzzNumber = 0;
        while (true) {
            if (inputIntegerNumber <= 0) {
                System.out.println("This number is not natural!");
                break;
            }
            printEvenOrOdd(inputIntegerNumber);
            if (inputIntegerNumber % 7 == 0) {
                isBuzzNumber += 1;
            }
            if (inputIntegerNumber % 10 == 7) {
                isBuzzNumber += 2;
            }

            if (isBuzzNumber != 0) {
                System.out.println("It is a Buzz number.");
            } else {
                System.out.println("It is not a Buzz number.");
            }
            System.out.println("Explanation:");
            switch (isBuzzNumber) {
                case 1:
                    System.out.printf("%d is divisible by 7.", inputIntegerNumber);
                    break;
                case 2:
                    System.out.printf("%d ends with 7.", inputIntegerNumber);
                    break;
                case 3:
                    System.out.printf("%d is divisible by 7 and ends with 7.", inputIntegerNumber);
                    break;
                default:
                    System.out.printf("%d is neither divisible by 7 nor does it end with 7.", inputIntegerNumber);
                    break;
            }
            break;
        }
    }

    private static void printEvenOrOdd(int inputIntegerNumber) {
        if (inputIntegerNumber % 2 == 0) {
            System.out.println("This number is Even.");
        } else {
            System.out.println("This number is Odd.");
        }
    }

}