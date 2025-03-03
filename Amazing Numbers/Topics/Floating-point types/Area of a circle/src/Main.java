import java.util.Scanner;
import java.lang.Math.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        System.out.println(Math.PI * Math.pow(radius, 2));
    }
}
