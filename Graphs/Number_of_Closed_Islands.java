class Solution {
    public int closedIsland(int[][] grid) {
        //check from (1,1) to (r-1,c-1);
        //dfs four directions of matrix with zero element
        //same as number of islands
        //instead check for zeroes
        
        //perform dfs on zero elements
        int res = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 0){
                    if(dfs(grid,i,j)){
                        res++;
                    }
                }
               
            }
        }
        
        return res;
    }
    public boolean dfs(int[][] grid,int r,int c){
        //termination case
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length ){
            return false;
        }
        //if we reach the edge with zero as value
        if(grid[r][c] == 1){
            return true;
        }
        //make curr grid as 1
        grid[r][c] = 1;
        
        boolean right = dfs(grid,r+1,c);
        boolean left = dfs(grid,r-1,c);
        boolean up = dfs(grid,r,c+1);
        boolean down = dfs(grid,r,c-1);
        
        return left && right && up && down;
    }
}
