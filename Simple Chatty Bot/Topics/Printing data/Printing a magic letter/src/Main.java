class Main {
    public static void main(String[] args) {
        printChar('*',8);
        System.out.println();
        printChar(' ',6);
        printChar('*',2);
        System.out.println();
        printChar(' ', 6);
        printChar('*', 2);
        System.out.println();
        printChar(' ', 6);
        printChar('*', 2);
        System.out.println();
        printChar('*', 2);
        printChar(' ', 4);
        printChar('*', 2);
        System.out.println();
        printChar('*', 2);
        printChar(' ', 4);
        printChar('*', 2);
        System.out.println();
        printChar(' ',1);
        printChar('*',7);
        // put your code here
    }

    public static void printChar(char charToPrint, int numberOfChars) {
        for (int i = 0; i < numberOfChars; i++) {
            System.out.print(charToPrint);
        }
    }
}