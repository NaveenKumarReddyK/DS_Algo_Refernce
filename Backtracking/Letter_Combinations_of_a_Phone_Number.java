//Link : https://leetcode.com/problems/letter-combinations-of-a-phone-number/

class Solution {
    public List<String> letterCombinations(String digits) {
        //backtracking
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return res;
        }
        char[][] map = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
            backtrack(res,digits,new StringBuilder(),map,0);
                          return res;
    }
    
    public void backtrack(List<String> res,String digits,StringBuilder comb,char[][] map,int start){
        if(comb.length() == digits.length()){
           
            res.add(comb.toString());
            return;
        }
        int index = digits.charAt(start) - '0';
       
            for(int i= 0;i<map[index].length;i++){
                comb.append(map[index][i]);
                backtrack(res,digits,comb,map,start+1);
                comb.deleteCharAt(comb.length()-1);
            }
    }
}
