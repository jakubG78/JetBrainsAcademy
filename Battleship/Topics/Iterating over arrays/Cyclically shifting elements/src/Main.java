import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        int[] tempNumbers = new int[arrayLength];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i + 1 < numbers.length) {
                tempNumbers[i + 1] = numbers[i];
            } else {
                tempNumbers[0] = numbers[i];
            }
        }
        for (int number : tempNumbers) {
            System.out.printf(number + "\s");
        }
    }
}