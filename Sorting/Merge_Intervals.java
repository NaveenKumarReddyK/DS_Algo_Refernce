//Link : https://leetcode.com/problems/merge-intervals/

class Solution {
    public int[][] merge(int[][] arr) {
        
        //base case
        if(arr.length == 0){
            return new int[][]{};
        }
        
        //sort interval based on start
        // if equal the based on end
        
        Arrays.sort(arr,new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                return a[0] == b[0] ? a[1] - b[1] : a[0] - b [0];
            }
        });
        
        List<int[]> res = new ArrayList<>();
        int start = arr[0][0];
        int end = arr[0][1];
        
        for(int i=1 ;i<arr.length;i++){
            //check if current start interval is equal
            //then end should be max of current end and recorded max end
            if(arr[i-1][0] == arr[i][0]){
                end = Math.max(arr[i][1],end);
            }
            
            //check if current start interval is less than recorded end
            //them end should be max of current end and recorded max end
            else if(end >= arr[i][0]){
                 end = Math.max(arr[i][1],end);
            }
            
            //add the recorded end and start interval
            //set start and end to current values
            else{
                res.add(new int[] {start,end});
                start = arr[i][0];
                end = arr[i][1];
            }
        }
        
        //add the last remained intervals to the response
        //this is beacuse there are no intervals after the end to check for merging
        res.add(new int[]{start,end});
        
        //add them to response arre
        int[][] resArr = new int[res.size()][2];
        for(int i=0;i<res.size();i++){
            resArr[i] = res.get(i);
        }
        return resArr;
    }
}
