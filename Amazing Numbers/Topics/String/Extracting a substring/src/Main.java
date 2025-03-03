import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.nextLine();
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();
        System.out.println(stringInput.substring(startIndex, endIndex + 1));
    }
}