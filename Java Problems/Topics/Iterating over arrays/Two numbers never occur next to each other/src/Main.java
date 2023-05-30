import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean result = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == n && array[i + 1] == m
                    || array[i] == m && array[i + 1] == n) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}