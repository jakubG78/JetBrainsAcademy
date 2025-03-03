import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int tripletsCounter = 0;
        for (int i = 0; i < numbers.length - 2; i++) {
            if (numbers[i] + 2 == numbers[i + 1] + 1 && numbers[i] + 2 == numbers[i + 2]) {
                tripletsCounter++;
            }
        }
        System.out.println(tripletsCounter);
    }
}