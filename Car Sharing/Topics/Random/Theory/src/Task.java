// You can experiment here, it won’t be checked

import java.util.Scanner;

public class Task {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int busHeight = scanner.nextInt();
    int[] bridgesHeights = new int[scanner.nextInt()];
    boolean busWillCrash = false;
    for (int i = 0; i < bridgesHeights.length; i++) {
      bridgesHeights[i] = scanner.nextInt();
    }
    while (!busWillCrash) {
      for (int i = 0; i < bridgesHeights.length; i++) {
        if (busHeight >= bridgesHeights[i]) {
          System.out.println("Will crash on bridge " + (i + 1));
          busWillCrash = true;
          break;
        }
      }
    }
    if (!busWillCrash) {
      System.out.println("Will not crash");
    }
  }
}
