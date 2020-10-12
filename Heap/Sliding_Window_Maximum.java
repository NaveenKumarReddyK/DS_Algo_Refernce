// Link : https://leetcode.com/problems/sliding-window-maximum/

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k > nums.length){
            return new int[]{};
        }
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->{
            return Integer.compare(nums[b],nums[a]);
            });
        
        int[] res = new int[nums.length-k+1];
        for(int i=0;i<k-1;i++){
            q.add(i);
        }
        for(int i=k-1;i<nums.length;i++){
            q.add(i);
            while(q.peek()<i - k + 1){
                q.poll();
            }
            int index = q.peek();
            res[i - k + 1] = nums[index];
        }
        return res;
    }
}
