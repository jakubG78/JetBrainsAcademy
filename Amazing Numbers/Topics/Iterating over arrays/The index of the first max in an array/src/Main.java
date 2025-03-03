import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];
        int firstMaxNumberIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > numbers[firstMaxNumberIndex]) {
                firstMaxNumberIndex = i;
            }
        }
        System.out.println(firstMaxNumberIndex);
    }
}