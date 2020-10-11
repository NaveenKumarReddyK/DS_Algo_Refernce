//Link : https://leetcode.com/problems/palindrome-partitioning/

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<List<String>>();
        backtrack(res,new ArrayList<String>(),s,0);
        return res;
    }
    
    public void backtrack(List<List<String>> res, List<String> comb ,String s, int start){
        if(start == s.length()){
            res.add(new ArrayList<String> (comb));
            return;
        }
         
            for(int i = start;i<s.length();i++){
                if(isPalindrome(s,start,i)){
                    comb.add(s.substring(start,i+1));
                    backtrack(res,comb,s,i+1);
                    comb.remove(comb.size()-1);
                }
            }
         
    }
    
    public boolean isPalindrome(String s,int low,int high){
        while(low<high){
            if(s.charAt(low) != s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
