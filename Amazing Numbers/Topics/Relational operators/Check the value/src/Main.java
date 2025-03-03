import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        System.out.println(isInRange(inputNumber));
        // put your code here
    }

    public static boolean isInRange(int number) {
        return number > 0 && number < 10;
    }
}
