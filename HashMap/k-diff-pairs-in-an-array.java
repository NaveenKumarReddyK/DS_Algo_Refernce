//https://leetcode.com/problems/k-diff-pairs-in-an-array
  public int findPairs(int[] nums, int k) {
        //HashMap to count frequencies of all elements
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        int res = 0;
        //iterate through map
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            //case 1 : if k == 0
            //then we neet to count number of elements that occur more than twice
            if( k== 0 && e.getValue() >1){
                res++;
            }
            
            //case 2 : if k > 0
            //check if the sum is present in map
            int curr_key = (int) e.getKey();
            if(k > 0 && map.containsKey(curr_key+k)){
                res++;
            }
        }
        
        return res;
    }
