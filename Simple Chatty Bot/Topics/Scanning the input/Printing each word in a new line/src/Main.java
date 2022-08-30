import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        new Scanner(System.in).forEachRemaining(words::add);
        words.forEach(System.out::println);
    }
}