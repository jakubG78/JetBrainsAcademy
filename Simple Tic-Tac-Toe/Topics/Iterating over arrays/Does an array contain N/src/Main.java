import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersLength = scanner.nextInt();
        int[] numbers = new int[numbersLength];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int searchedNumber = scanner.nextInt();
        boolean numberIsFound = false;
        for (int number : numbers) {
            if (number == searchedNumber) {
                numberIsFound = true;
                break;
            }
        }
        System.out.println(numberIsFound);
    }
}