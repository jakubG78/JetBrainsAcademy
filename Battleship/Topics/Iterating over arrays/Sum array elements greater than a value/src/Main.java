import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        readInputToArray(scanner, numbers);
        int n = scanner.nextInt();
        System.out.print(getSumGreaterThanN(numbers, n));
    }

    private static int getSumGreaterThanN(int[] numbers, int n) {
        int result = 0;
        for (int number : numbers) {
            if (number > n) {
                result += number;
            }
        }
        return result;
    }

    private static void readInputToArray(Scanner scanner, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
    }
}