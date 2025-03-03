import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        String longestWord = "";
        for (String string : strings) {
            longestWord = string.length() > longestWord.length() ? string : longestWord;
        }
        System.out.println(longestWord);
    }
}