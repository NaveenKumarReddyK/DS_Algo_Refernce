//Link : https://leetcode.com/problems/combination-sum-iii/
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        backtrack(res,new ArrayList<>(),1,n,k);
        return res;
    }
    public void backtrack(List<List<Integer>> res , List<Integer> comb, int start ,int remain , int l_size){
        if(remain == 0 && comb.size() == l_size){
            res.add(new ArrayList<Integer>(comb) );
            return;
        }
        else if(remain < 0 || comb.size() == l_size){
            return;
        }
        
        for(int i = start;i<=9;i++){
            comb.add(i);
            backtrack(res,comb,i+1,remain - i,l_size);
            comb.remove(comb.size() - 1);
        }
    }
}
