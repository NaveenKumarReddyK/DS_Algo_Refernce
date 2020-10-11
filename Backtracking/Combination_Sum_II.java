//Link : https://leetcode.com/problems/combination-sum-ii/
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
     List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backtrack(res,new ArrayList<Integer>(),0,candidates,target);
        return res;
    }
    
    public void backtrack(List<List<Integer>> res, List<Integer> comb ,int start,int[] candidates,int target){
        if(target == 0){
            res.add(new ArrayList<>(comb));
            return;
        }
         if(target < 0){
            return ;
        }
        
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i] == candidates[i-1]){continue;}
            comb.add(candidates[i]);
            backtrack(res,comb,i+1,candidates,target - candidates[i]);
            comb.remove(comb.size()-1);
        }
    }
}
