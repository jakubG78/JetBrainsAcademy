import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<String> vowels = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u", "y"));
        input = input.toLowerCase();
         if (vowels.contains(String.valueOf(input.charAt(0)))) {
            System.out.println("Pała!");
        }
    }
}