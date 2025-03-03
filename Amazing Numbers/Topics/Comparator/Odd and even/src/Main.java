import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Utils {

    public static List<Integer> sortOddEven(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }
        Collections.sort(oddNumbers);
        evenNumbers.sort(Collections.reverseOrder());
        numbers.clear();
        numbers.addAll(oddNumbers);
        numbers.addAll(evenNumbers);
        return numbers;
    }
}