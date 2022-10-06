import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersArrayLength = scanner.nextInt();
        int[] numbers = new int[numbersArrayLength];
        int sumOfNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sumOfNumbers += numbers[i];
        }

        System.out.print(sumOfNumbers);
    }
}