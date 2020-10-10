class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->{
            return matrix[a[0]][a[1]] - matrix[b[0]][b[1]];
        });
        //add all the start node of the rows
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        for(int i=0;i<rowLen;i++){
            q.offer(new int[]{i,0});
        }
        
        int res = 0;
        int count = 0;
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int row = curr[0];
            int col = curr[1];
            count++;
            res = matrix[row][col];
            if(count == k){
                return res;
            }
            if(colLen > col+1){
                q.offer(new int[]{row,col+1});
            }
            
        }
        return res;
    }
}
