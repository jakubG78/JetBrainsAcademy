import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] letters = scanner.nextLine().toLowerCase().split("");
        int charsToBeRepleacedCounter = 0;
        for (int i = 0; i < letters.length - 2; i++) {
            if (isVowel(letters[i]) && isVowel(letters[i + 1]) && isVowel(letters[i + 2])) {
                charsToBeRepleacedCounter++;
                letters[i + 1] = "b";
            } else if (!isVowel(letters[i]) && !isVowel(letters[i + 1]) && !isVowel(letters[i + 2])) {
                charsToBeRepleacedCounter++;
                letters[i + 1] = "a";
            }
        }
        System.out.println(charsToBeRepleacedCounter);
    }

    public static boolean isVowel(String testedLetter) {
        ArrayList<String> vowels = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u", "y"));
        return vowels.contains(testedLetter);

    }
}