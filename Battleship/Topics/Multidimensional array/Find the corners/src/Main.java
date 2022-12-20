
class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        int[] firstRowArray = twoDimArray[0];
        int[] lastRowArray = twoDimArray[twoDimArray.length - 1];
        System.out.println(firstRowArray[0] + " " + firstRowArray[firstRowArray.length - 1]);
        System.out.println(lastRowArray[0] + " " + lastRowArray[lastRowArray.length - 1]);
    }
}