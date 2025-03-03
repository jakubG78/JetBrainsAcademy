import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer input = Integer.valueOf(scanner.nextLine());
        System.out.println(input / 100 + (input / 10) % 10 + input % 10);
    }
}