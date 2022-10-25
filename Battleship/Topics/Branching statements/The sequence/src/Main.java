import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strOut = "";
        int count = scanner.nextInt();
        boolean conCount = true;
        int elementsCount = 0;

        for (int i = 1; i <= count & conCount; i++) {
            for (int j = 0; j < i; j++) {
                strOut = strOut.concat(" ").concat(Integer.toString(i)).trim();
                elementsCount++;
                if (elementsCount == count){
                    conCount = false;
                    break;
                }
            }
        }
        System.out.print(strOut);
    }
}