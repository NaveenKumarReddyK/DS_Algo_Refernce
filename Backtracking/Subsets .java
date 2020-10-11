//Link : https://leetcode.com/problems/subsets-ii/

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        backtrack(res,new ArrayList<Integer>(),nums,0,set);
        return res;
    }
    public void backtrack(List<List<Integer>> res ,List<Integer> comb,int[] arr,int start,HashSet<List<Integer>> set){
        if(set.add(comb)){
             res.add(new ArrayList<Integer>(comb));
        }
       
        for(int i=start;i<arr.length;i++){
            comb.add(arr[i]);
            backtrack(res,comb,arr,i+1,set);
            comb.remove(comb.size()-1);
        }
    }
}
