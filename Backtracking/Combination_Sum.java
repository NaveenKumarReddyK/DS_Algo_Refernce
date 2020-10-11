//Link : https://leetcode.com/problems/combinations

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        backtrack(res,new ArrayList<Integer>(),1,n,k);
        return res;
    }
    public void backtrack(List<List<Integer>> res,List<Integer> comb,int start,int end,int k){
        if(k == 0){
            res.add(new ArrayList<>(comb));
            return;
        }
        //valid last position for pos i is n - k +1
        for(int i=start;i<=end-k+1;i++){
            comb.add(i);
            backtrack(res,comb,i+1,end,k-1);
            comb.remove(comb.size()-1);
        }
    }
}
