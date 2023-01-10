// You can experiment here, it won’t be checked

import java.io.File;
import java.io.IOException;

public class Task {
  public static void main(String[] args) throws IOException {
    File file = new File("E:/filename.txt");
    File renamedFile = new File("E:/newname.txt");

    boolean renamed = file.renameTo(renamedFile);
    if (renamed) {
      System.out.println("It was successfully renamed.");
    } else {
      System.out.println("It was not renamed.");
    }
  }
}
