class Kth_Largest_Element {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int num : nums){
            q.add(num);
            if(q.size()>k){
                q.poll();
            }
        }
        return q.peek();
    }
}
