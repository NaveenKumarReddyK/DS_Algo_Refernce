class Longest_Palindromic_Subsequence {
    public int longestPalindromeSubseq(String s) {
        //DP solution
        //dp[i][j] == substring from index i to index j
        int[][] dp = new int[s.length()][s.length()];
        for(int i=s.length()-1;i>=0;i--){
            //substring of length 1 is also a plindrome
            dp[i][i] = 1; 
            for(int j = i+1;j<s.length();j++){
                //if start and end chars are same
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1] +2;
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        //longest palindromic substring from index 0 to s.length-1
        return dp[0][s.length()-1];
    }
}
