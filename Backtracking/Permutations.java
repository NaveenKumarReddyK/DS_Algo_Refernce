//Link : https://leetcode.com/problems/permutations/
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        backtrack(res,new ArrayList<Integer>(),nums);
        return res;
    }
    public void backtrack(List<List<Integer>> res, List<Integer> comb,int[] nums){
        if(comb.size() == nums.length){
            res.add(new ArrayList<>(comb));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(comb.contains(nums[i])){continue;}
            comb.add(nums[i]);
            backtrack(res,comb,nums);
            comb.remove(comb.size()-1);
        }
    }
}
