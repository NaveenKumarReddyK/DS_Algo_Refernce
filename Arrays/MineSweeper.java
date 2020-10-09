public class MineSweeper {
    public static void minWeepify(int[][] arr,int rows,int cols,int[][] bombs){
        for(int k = 0;k<bombs.length;k++){
            int r = bombs[k][0];
            int c = bombs[k][1];
            arr[r][c] = -1;
            for(int i=r-1;i<=r+1;i++){
                for(int j=c-1;j<=c+1;j++){
                    if(i<rows && j<cols && i>=0 && j>=0){
                        if(arr[i][j] != -1){
                            arr[i][j]++;
                        }

                    }
                }
           }
        }

        for(int a=0;a<rows;a++){
            for(int b=0;b<cols;b++){
                System.out.print(arr[a][b]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[][] bombs = {{1,0},{0,1}};
        int rows = 3;
        int cols = 4;
//        mine_sweeper(bombs,rows,cols);
        int[][] minSweepArray = new int[rows][cols];
//        int bRow = bombs.length;
//        int bCol = bombs[0].length;
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                minSweepArray[i][j] = 0;
            }
        }


        minWeepify(minSweepArray,rows,cols,bombs );

    }
}
