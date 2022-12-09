import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seedFrom = scanner.nextInt();
        int seedTo = scanner.nextInt();
        int minGeneratedValue = scanner.nextInt();
        int maxGeneratedValue = scanner.nextInt();
        int maxValueInRange = 0;
        Random random;
        for (int i = seedFrom; i < seedTo; i++) {
            random = new Random(i);
            for(int j = minGeneratedValue; j < maxGeneratedValue; j++){


            }

        }
    }
}