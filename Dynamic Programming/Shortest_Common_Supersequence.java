//Link : https://leetcode.com/problems/shortest-common-supersequence/

class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        //find lcs of str1 and str2
        String lcs = longestCommomSubString(str1,str2);
        StringBuilder res = new StringBuilder();
        int i = 0; int j = 0;
        //traverse through LCS
        for(int k = 0;k<lcs.length();k++){
            //check if s1 is not traversed to end
            //and curr char is not equal to the one int the lcs
            while(i<str1.length() && str1.charAt(i) != lcs.charAt(k)){
                res.append(str1.charAt(i));
                i++;
            }
            
            //same here but in s2
            while(j<str2.length() && str2.charAt(j) != lcs.charAt(k)){
                res.append(str2.charAt(j));
                j++;
            }
            
            //if completed traversal of above two loops
            //add curr char in the lcs string
            
            res.append(lcs.charAt(k));
            i++;
            j++;
        }
        
        //append remaining substrings in s1 and s2 to response
        res.append(str1.substring(i)).append(str2.substring(j));
        
        //output response string
        return res.toString();
        
    }
    public String longestCommomSubString(String s1,String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        String[][] dp = new String[len1+1][len2+1];
        for(int i= 0;i<dp.length;i++){
            Arrays.fill(dp[i],"");
        }
        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + s1.charAt(i-1);
                }
                else{
                    dp[i][j] = (dp[i-1][j].length() > dp[i][j-1].length())?dp[i-1][j] : dp[i][j-1];
                }
            }
        }
        
        return dp[len1][len2];
    }
}
