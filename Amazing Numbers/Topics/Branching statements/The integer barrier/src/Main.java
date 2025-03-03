import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumLimit = 1000;
        int sum = 0;
        while (sum < sumLimit) {
            int inputNumber = scanner.nextInt();
            if (inputNumber == 0) {
                break;
            }
            sum += inputNumber;
            if (sum >= sumLimit) {
                sum -= sumLimit;
                break;
            }
        }
        System.out.println(sum);
    }
}