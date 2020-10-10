class Sort_Characters_By_Frequency {
    public String frequencySort(String s) {
        PriorityQueue<Map.Entry<Character,Integer>> q = new PriorityQueue<>(
        (a,b)->(a.getValue() == b.getValue()?a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue())
        );
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            q.add(m);
        }
        
        StringBuilder sb = new StringBuilder();
        while(!q.isEmpty()){
            char c = (char) q.peek().getKey();
            int count = (int) q.peek().getValue();
            while(count>0){
                sb.append(c);
                count--;
            }
            q.poll();
        }
        return sb.toString();
    }
}
