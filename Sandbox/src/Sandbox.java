public class Sandbox {
    public static void main(String[] args) {

        System.out.println(gcd(11, 161));

    }

    public static int gcd(int a, int b) {
        while (b > 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}
