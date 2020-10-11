//Link : https://leetcode.com/problems/combination-sum/
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(res,new ArrayList<Integer>(),0,target,candidates);
        return res;
    }
    public void backtrack(List<List<Integer>> res ,List<Integer> comb,int start ,int target,int[] candidates){
        if(target == 0){
            res.add(new ArrayList<>(comb));
            return;
        }
        else if(target < 0){
            return;
        }
        
        for(int i=start;i<candidates.length;i++){
            comb.add(candidates[i]);
            backtrack(res,comb,i,target - candidates[i],candidates);
            comb.remove(comb.size()-1);
        }
    }
}
