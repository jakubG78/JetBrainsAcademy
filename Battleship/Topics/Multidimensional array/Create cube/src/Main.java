
class ArrayOperations {
    public static int[][][] createCube() {
        int[][][] outputCube = new int[3][3][3];
        for (int i = 0; i < outputCube.length; i++) {
            int couter = 0;
            for (int j = 0; j < outputCube[0].length; j++) {
                for (int k = 0; k < outputCube[0][0].length; k++) {
                    outputCube[i][j][k] = couter;
                    couter++;

                }
            }
        }
        return outputCube;
    }
}