import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(isSortedArray(array, array.length));
    }

    private static boolean isSortedArray(int[] array, int n) {
        if (n == 1 || n == 0) return true;
        return array[n - 2] <= array[n - 1] && isSortedArray(array, n - 1);
    }
}