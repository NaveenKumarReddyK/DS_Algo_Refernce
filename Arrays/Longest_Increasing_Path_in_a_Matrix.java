class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        //dfs 
        //traveres in all the four directions
        //check for larger values from the curr cell
        
        //BASE CASE
        if(matrix.length == 0){
            return 0;
        }
        int maxLen = 0;
        int[][] visited = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int currMax = dfs(matrix,i,j,Integer.MIN_VALUE,visited);
                maxLen = Math.max(maxLen,currMax);
            }
        }
        return maxLen;
    }
    public int dfs(int[][] matrix,int r,int c,int prev,int[][] visited){
        if(r < 0 || c < 0 || r >= matrix.length || c >= matrix[0].length || matrix[r][c] <= prev){
            return 0;
        }
        //check if we have already caluculated the path for current matrix
        if(visited[r][c] > 0){
            //return the same value
            return visited[r][c];
        }
        
        //traverse in all four directions
        int tempMax = Integer.MIN_VALUE;
        //caluculate max of all the four directions
        //current value becomes prv value for next calucualtion
        int currVal = matrix[r][c];
        tempMax = Math.max(tempMax,dfs(matrix,r+1,c,currVal,visited));
        tempMax = Math.max(tempMax,dfs(matrix,r-1,c,currVal,visited));
        tempMax = Math.max(tempMax,dfs(matrix,r,c+1,currVal,visited));
        tempMax = Math.max(tempMax,dfs(matrix,r,c-1,currVal,visited));
        //increment tempMax val 
        tempMax++;
        //make the visited value of current pos as tempMax
        visited[r][c] = tempMax;
        //return max value of this pos
        return tempMax;
    }
}
