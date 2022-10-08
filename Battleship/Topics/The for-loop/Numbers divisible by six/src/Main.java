import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbersDivBySix = 0;
        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int number : numbers) {
            if (number % 6 == 0) {
                sumOfNumbersDivBySix += number;
            }
        }
        System.out.println(sumOfNumbersDivBySix);
    }
}