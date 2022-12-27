package converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean toQuit = false;
        String inputCommand;
        while (!toQuit) {
            System.out.print("Do you want to convert /from decimal or /to decimal? (To quit type /exit) ");
            inputCommand = scanner.nextLine();
            switch (inputCommand) {
                case "/from":
                    System.out.print("Enter number in decimal system: ");
                    int decimalNumber = scanner.nextInt();
                    System.out.print("Enter target base: ");
                    int targetNumberBase = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Conversion result: " + convertDecNumber(decimalNumber, targetNumberBase));
                    break;

                case "/exit":
                    toQuit = true;
                    break;

                default:
                    System.out.println("Unknown command. Try again.");
                    break;
            }
        }
    }

    public static String convertDecNumber(int numberToConvert, int targetNumberBase) {
        StringBuilder targetNumber = new StringBuilder();
        if (numberToConvert == 0 || targetNumberBase == 0) {
            return "0";
        }
        while (numberToConvert > 0) {

            if (targetNumberBase == 1) {
                targetNumber.append(1);
                numberToConvert--;
            } else {
                targetNumber.append(getDigitAboveNine(numberToConvert % targetNumberBase));
                numberToConvert = numberToConvert / targetNumberBase;
            }

        }
        return targetNumber.reverse().toString();
    }

    private static char getDigitAboveNine(int rest) {
        if (rest < 10) {
            return (char) (rest + '0');
        } else {
            return (char) ('A' + rest - 10);
        }
    }
}
