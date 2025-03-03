import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInputString = scanner.nextLine().replaceAll("\s", "");
        String secondInputString = scanner.nextLine().replaceAll("\s", "");
        System.out.println(firstInputString.equals(secondInputString));
    }
}