import java.util.Arrays;
import java.util.Scanner;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        int[] result = new int[arr.length];
        for (int k = 0; k < steps; k++) {
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    result[arr.length - 1] = arr[i];
                    result[0] = arr[arr.length - 1];
                } else {
                    result[i] = arr[i - 1];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = result[i];
            }
        }
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}