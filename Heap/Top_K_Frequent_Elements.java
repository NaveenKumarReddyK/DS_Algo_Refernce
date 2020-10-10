class Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> q = new PriorityQueue<>(
        (a,b) ->   a.getValue() == b.getValue() ? a.getKey() - b.getKey() : a.getValue() - b.getValue()
 
        );
        
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            q.add(m);
            if(q.size()>k){
                q.poll();
            }
        }
        int[] arr = new int[k];
        for(int i=k-1;i>=0;i--){
            arr[i] =q.poll().getKey();
        }
        return arr;
    }
}
