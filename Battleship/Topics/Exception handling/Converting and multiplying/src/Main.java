import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputStrings = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (!input.equals("0")) {
                inputStrings.add(input);
            } else {
                break;
            }
        }
        for (String inputString : inputStrings) {
            try {
                System.out.println(Integer.valueOf(inputString) * 10);
            } catch (Exception e) {
                System.out.printf("Invalid user input: %s%n", inputString);
            }
        }
    }
}
