// You can experiment here, it won’t be checked

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task {
  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);

    List<Integer> list2 = new LinkedList<>();
    list2.add(3);
    list2.add(2);
    list2.add(1);

    List<Integer> list3 = List.of(1, 2, 3);

    List<Integer> list4 = List.of(1, 1, 2, 2, 3, 3);

    System.out.println(list1.equals(list1));
    System.out.println(list1.equals(list2));
    System.out.println(list1.equals(list3));
    System.out.println(list2.equals(list3));
    System.out.println(list3.equals(list4));
  }
}
