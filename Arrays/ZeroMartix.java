//CTCI Q-1.8
public class ZeroMartix {
    public static void convertToZeroMatrix(int[][] arr){
        boolean[] row = new boolean[arr.length];
        boolean[] col = new boolean[arr[0].length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i=0;i<row.length;i++){
            if(row[i]){
                nillifyRow(arr,i);
            }
        }
        for(int j=0;j<col.length;j++){
            if(col[j]){
                nullifyCol(arr,j);
            }
        }

        //print matrix
        printMatrix(arr);
    }
    public static void nillifyRow(int[][] arr,int rowNum){
        for(int k=0;k<arr[0].length;k++){
            arr[rowNum][k] = 0;
        }
    }
    public static void nullifyCol(int[][] arr,int colNum){
        for(int k=0;k<arr.length;k++){
            arr[k][colNum] = 0;
        }
    }
    public static void printMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{2,3,5,6,5},{1,0,6,6},{1,2,3,4}};
        convertToZeroMatrix(arr);

    }
}
