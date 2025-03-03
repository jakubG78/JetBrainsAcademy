import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        Set<Integer> result = new HashSet<>();
        String[] input = str.split(" ");
        for (String inputUnit : input) {
            result.add(Integer.parseInt(inputUnit));
        }
        return result;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(number -> number > 10);
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}