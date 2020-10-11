//Link : https://leetcode.com/problems/unique-paths-iii/

class Solution {
    int count ;
    int res;
    public int uniquePathsIII(int[][] grid) {
        //find gird with 1 to start
        //count zeroes
        //dfs
        count = 1; //if empty the loop doesnt run
        res = 0;
        int start_x = 0;
        int start_y = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 0){
                    count++;
                }
                else if(grid[i][j] == 1){
                    start_x = i;
                    start_y = j;
                }
            }
        }
        
        dfs(grid,start_x,start_y);
        return res;
    }
    
    public void dfs(int[][] grid,int x_pos ,int y_pos){
        //check for true condition
        if(x_pos<0 || y_pos < 0 || x_pos >= grid.length || y_pos >= grid[0].length || grid[x_pos][y_pos] <0){
            return;
        }
        //check if it has reached the end
        if(grid[x_pos][y_pos] == 2){
            //check if there are no zero cells
            if(count == 0){
                res++;
               
            } return;
        }
        
        //make the cell invalid
        grid[x_pos][y_pos] = -2;
        //decrement zero count
        count--;
        
        //dfs in four direction
        dfs(grid,x_pos,y_pos+1);
        dfs(grid,x_pos,y_pos-1);
        dfs(grid,x_pos+1,y_pos);
        dfs(grid,x_pos-1,y_pos);
        
       
        
        //reset the cell
        grid[x_pos][y_pos] = 0;
        
        //increment zero count
        count++;
    }
}
