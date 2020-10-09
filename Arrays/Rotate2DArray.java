public class Rotate2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] newArr = new int[arr.length][arr.length];
        int len = arr.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                newArr[j][len-1-i] = arr[i][j];
            }
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                System.out.print(newArr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
