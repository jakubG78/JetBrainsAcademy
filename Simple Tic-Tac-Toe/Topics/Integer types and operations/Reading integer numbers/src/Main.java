import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[4];
        int i = 0;
        while (scanner.hasNext()) {
            inputArray[i] = scanner.nextInt();
            i++;
        }
        for (int number : inputArray) {
            System.out.println(number);
        }
    }
}