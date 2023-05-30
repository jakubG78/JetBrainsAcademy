import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int maxProduct = 0;
        for (int i = 0; i < array.length; i++) {
            if (i + 1 < array.length) {
                int tempProduct = array[i] * array[i + 1];
                if (tempProduct > maxProduct) {
                    maxProduct = tempProduct;
                }
            }
        }
        System.out.println(maxProduct);
    }
}