import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] inputParts = new Scanner(System.in).nextLine().split("\\s+");
        List<Object> list = new ArrayList<>();
        for (int i = 1; i < inputParts.length; i += 2) {
            list.add(inputParts[i]);
        }
        Collections.reverse(list);
        list.forEach(t -> System.out.printf("%s ", t));
    }
}