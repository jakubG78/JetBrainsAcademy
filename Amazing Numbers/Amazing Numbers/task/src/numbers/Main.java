package numbers;

import java.util.Scanner;

public class Main {
    public static boolean isNatural(long n) {
        return n > 0;
    }

    public static boolean isEven(long n) {
        return n % 2 == 0;
    }

    public static boolean isBuzz(long n) {
        return (n % 7 == 0 || n % 10 == 7);
    }

    public static boolean isDuck(long n) {
        String strN = String.valueOf(n);
        return (strN.contains("0") && strN.lastIndexOf("0") > 0);
    }

    public static boolean isPalindromic(long n) {
        String strN = String.valueOf(n);
        int len = strN.length();
        int middleIndex = len / 2;
        for (int i = 0; i < middleIndex; i++) {
            if (strN.charAt(i) != strN.charAt(len - 1 - i))
                return false;
        }
        return true;
    }

    public static boolean isGapful(long n) {
        String strN = String.valueOf(n);
        if (strN.length() < 3)
            return false;
        long divisor = Long.parseLong(strN.charAt(0) + "" + strN.charAt(strN.length() - 1));
        return n % divisor == 0;
    }

    public static void printProps(long n) {
        System.out.println("Properties of " + n);
        System.out.printf("buzz: %s\n", isBuzz(n));
        System.out.printf("duck: %s\n", isDuck(n));
        System.out.printf("palindromic: %s\n", isPalindromic(n));
        System.out.printf("gapful: %s\n", isGapful(n));
        System.out.printf("even: %s\n", isEven(n));
        System.out.printf("odd: %s\n", !isEven(n));
    }

    public static void printInlineProps(long n) {
        String buzz = isBuzz(n) ? "buzz, " : "";
        String duck = isDuck(n) ? "duck, " : "";
        String palindromic = isPalindromic(n) ? "palindromic, " : "";
        String gapful = isGapful(n) ? "gapful, " : "";
        String even = isEven(n) ? "even" : "odd";

        System.out.printf("%d is %s%s%s%s%s\n", n, buzz, duck, palindromic, gapful, even);
    }

    public static void printMenu() {
        System.out.println("Supported requests:\n" +
                "- enter a natural number to know its properties;\n" +
                "- enter two natural numbers to obtain the properties of the list:\n" +
                "  * the first parameter represents a starting number;\n" +
                "  * the second parameter shows how many consecutive numbers are to be printed;\n" +
                "- separate the parameters with one space;\n" +
                "- enter 0 to exit.");
    }

    public static void main(String[] args) {
//      write your code here
        System.out.println("Welcome to Amazing Numbers!");
        printMenu();
        long n = -1;
        int listLength;
        while (n != 0) {
            System.out.println("Enter a request: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.isEmpty() || input.isBlank()) {
                printMenu();
                continue;
            }
            String[] params = input.split(" ");
            n = Long.parseLong(params[0]);
            listLength = params.length == 1 ? 1 : Integer.parseInt(params[1]);
            if (n != 0) {
                if (!isNatural(n))
                    System.out.println("The first parameter should be a natural number or zero.");
                else if (!isNatural(listLength))
                    System.out.println("The second parameter should be a natural number.");
                else {
                    if (listLength == 1)
                        printProps(n);
                    else {
                        for (long i = 0; i < listLength; i++) {
                            printInlineProps(n++);
                        }
                    }
                }
            }
        }
        System.out.println("Goodbye!");
    }
}