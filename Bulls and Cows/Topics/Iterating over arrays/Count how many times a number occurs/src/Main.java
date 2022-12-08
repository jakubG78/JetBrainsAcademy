import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int howManyNumbers = scanner.nextInt();
        int[] numbers = new int[howManyNumbers];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int searchedNumber = scanner.nextInt();
        int numberCounter = 0;
        for (int number : numbers) {
            if (number == searchedNumber) {
                numberCounter++;
            }
        }
        System.out.println(numberCounter);
    }
}