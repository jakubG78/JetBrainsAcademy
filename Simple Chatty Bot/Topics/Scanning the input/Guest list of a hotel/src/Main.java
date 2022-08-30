import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        new Scanner(System.in).forEachRemaining(names::add);
        Collections.reverse(names);
        names.forEach(System.out::println);
    }
}