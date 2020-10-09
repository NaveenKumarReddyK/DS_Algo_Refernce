public class Search_In_TwoD_Matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0){
            return false;
        }
        int row = 0;
        int col = matrix[0].length-1;
        while(row < matrix.length && col >=0){
            int curr = matrix[row][col];
            if(curr == target){
                return true;
            }
            else if(curr < target){
                row++;
            }
            else if(curr > target){
                col--;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int target = 50;
        System.out.println(searchMatrix(matrix, target));
    }
}
