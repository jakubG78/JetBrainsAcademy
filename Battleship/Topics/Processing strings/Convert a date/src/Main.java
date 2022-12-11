import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.nextLine();
        String[] inputParts = inputDate.split("-");
        System.out.println(inputParts[1] + "/" + inputParts[2] + "/" + inputParts[0]);

    }
}