package converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter two numbers in format: {source base} {target base} (To quit type /exit) ");
            String input = scanner.nextLine();
            if (input.equals("/exit")) {
                break;
            }
            input = input.trim();
            String[] inputParts = input.split(" ");
            int sourceBase = Integer.parseInt(inputParts[0]);
            int targetBase = Integer.parseInt(inputParts[1]);
            while(true){
                System.out.printf("Enter number in base %d to convert to base %d (To go back type /back ) ", sourceBase, targetBase);
                input = scanner.nextLine();
                String result;
                if(input.equals("/back")){
                    System.out.println();
                    break;
                }
                if(targetBase == 10) {
                    result = Long.toString(convertToDecimal(input, sourceBase));
                } else {
                    long convertedToDecimal = convertToDecimal(input, sourceBase);
                    result = convertFromDecimalNumber(convertedToDecimal, targetBase);
                }
                System.out.printf("Conversion result: %s\n\n", result);
            }
        }
    }

    public static String convertFromDecimalNumber(long numberToConvert, long targetNumberBase) {
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

    public static long convertToDecimal(String sourceNumber, int sourceNoBase) {
        return Long.parseLong(sourceNumber, sourceNoBase);
    }

    private static char getDigitAboveNine(long rest) {
        if (rest < 10) {
            return (char) (rest + '0');
        } else {
            return (char) ('A' + rest - 10);
        }
    }
}
