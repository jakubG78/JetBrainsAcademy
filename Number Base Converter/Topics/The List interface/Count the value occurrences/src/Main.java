import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        int list1ElemCounter = countElementsInList(elem, list1);
        int list2ElemCounter = countElementsInList(elem, list2);

        return list1ElemCounter == list2ElemCounter;
    }

    public static int countElementsInList(int elem, List<Integer> list) {
        int listElemCounter = 0;
        for (Integer element : list) {
            if (element == elem) {
                listElemCounter++;
            }
        }
        return listElemCounter;
    }
}