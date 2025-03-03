import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] inputChars = input.toCharArray();
        for (char singleChar : inputChars) {
            System.out.print(singleChar);
            System.out.print(singleChar);
        }
    }
}