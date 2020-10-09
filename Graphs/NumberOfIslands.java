
/*
* DFS
* is safe util to check if curr index is 1 and not visted
* main function for dfs
* dfs util for for each util*/
class Island_Graph_Struc{
     public void numOfIslands(int[][] arr){
            int rows = arr.length;
            int cols = arr[0].length;
            boolean[][] visited = new boolean[rows][cols];
            int count = 0;
            for (int i=0;i<rows;i++){
                for (int j = 0; j < cols; j++) {
                    if(!visited[i][j] && arr[i][j] == 1){
                        islandUtil(arr,visited,i,j);
                        count++;
                    }
                }
            }
            if(count == 0){
                System.out.println("There exists no islands");
            }
            else {
                System.out.println("No of Islands : "+count);
            }
     }

     public void islandUtil(int[][] arr,boolean[][] visited,int row,int col){
         visited[row][col] = true;
         int[] rowMap = {-1,-1,-1,0,0,1,1,1};
         int[] colMap = {-1,0,1,-1,1,-1,0,1};
         //check for surroundings
         for (int k=0;k<8;k++){
             if(isSafeGrid(arr,row+rowMap[k],col+colMap[k],visited)){
                 islandUtil(arr,visited,row+rowMap[k],col+colMap[k]);
             }
         }
     }
     public boolean isSafeGrid(int[][] arr,int rowNum,int colNum,boolean[][] visited){
         int rowLength = arr.length;
         int colLength = arr[0].length;

         if(rowNum<rowLength && rowNum>=0 && colNum>=0 && colNum<colLength  && (arr[rowNum][colNum] == 1) && !visited[rowNum][colNum]){
             return true;
         }
         return false;
     }
}
public class NumberOfIslands {
    public static void main(String[] args) {
        int[][] arr =  { { 1, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 1 },
                { 1, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 1 } };

        Island_Graph_Struc g = new Island_Graph_Struc();
        g.numOfIslands(arr);
    }
}
