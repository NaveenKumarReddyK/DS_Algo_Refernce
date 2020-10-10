class Top_K_Frequent_Words {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
    
            PriorityQueue<Map.Entry<String,Integer>> q = new PriorityQueue<>(
            (a,b)-> a.getValue() == b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue()
            );
        
        
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        
        for(Map.Entry<String,Integer> m : map.entrySet()){
            q.add(m);
            if(q.size()>k){
                q.poll();
            }
        }
        
        while(!q.isEmpty()){
            list.add(0,q.poll().getKey());
        }
      
        return list;
    }
    
}
