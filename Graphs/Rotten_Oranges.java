//https://leetcode.com/problems/rotting-oranges/

import java.util.LinkedList;
import java.util.Queue;

public class Rotten_Oranges {
    //BFS
    //Make the node of the visited to rotten
    //count on each traversal

    public static int countTime(int[][] grid){
        int rowLen = grid.length;
        int colLen = grid[0].length;

        int time = -1;//1 min time is not elapsed
        Queue<int[]> q = new LinkedList<>();
        //Add all the rotten tomatoes in the queue
        for(int i=0;i<rowLen;i++){
            for (int j=0;j<colLen;j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }
            }
        }
        if(q.size() == 0){
            return time;
        }
        int[][] cor = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};;
        while (!q.isEmpty()){
            time++;
            int size = q.size();
            while (size>0){
                int[] curr = q.poll();
                for(int i=0;i<cor.length;i++){
                    int rowIndex = curr[0]+cor[i][0];
                    int colIndex = curr[1]+cor[i][1];
                    if(isSafe(rowIndex,colIndex,rowLen,colLen) && grid[rowIndex][colIndex] == 1){
                        grid[rowIndex][colIndex] = 2;
                        q.add(new int[]{rowIndex,colIndex});
                    }
                }

                size--;
            }
        }
        //check for reamining
        for (int r=0;r<rowLen;r++){
            for (int c=0;c<colLen;c++){
                if (grid[r][c] == 1){
                    return -1;
                }
            }
        }
        return time;


    }
    public static boolean isSafe(int rowIndex,int colIndex,int rowLen,int colLen){
        if(rowIndex>=0 && colIndex>=0 && rowIndex<rowLen && colIndex<colLen){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] graph = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(countTime(graph));
    }
}
