import java.util.*;
class Spiral_Order_Array {
    public static List < Integer > spiralOrder(int[][] matrix) {
        List < Integer > res = new ArrayList < > ();
        if (matrix.length == 0) {
            return res;
        }
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            //traverse right
            for (int j = colStart; j <= colEnd; j++) {
                res.add(matrix[rowStart][j]);
            }
            //increment rowStart
            rowStart++;
            //traverse down
            for (int i = rowStart; i <= rowEnd; i++) {
                res.add(matrix[i][colEnd]);
            }
            //decement colEnd
            colEnd--;
            //traverse left
            if (rowStart <= rowEnd) {
                for (int j = colEnd; j >= colStart; j--) {
                    res.add(matrix[rowEnd][j]);
                }
                //decrement rowEnd
                rowEnd--;
            }
            //traverse up
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    res.add(matrix[i][colStart]);
                }
                //increment colStart
                colStart++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] arr = {{ 1, 2, 3 },{ 4, 5, 6 },{ 7, 8, 9 }};
        System.out.println(spiralOrder(arr));
    }
}
