public class MatrixSum {
    public static int sum(int[][] array) {
        int rst = 0;
        for (int[] arrayRow : array) {
            for (int arr : arrayRow) {
                rst += arr;
            }
        }
        return rst;
    }
}