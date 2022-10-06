import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        double currentNumber = 1;

        do {
            System.out.print("\n" + (int) Math.pow(currentNumber, 2));
            currentNumber++;
        } while (Math.pow(currentNumber, 2) <= inputNumber);
    }
}