class Solution {
    public String longestPalindrome(String s) {
        //response string
        String res = null;
        //dp[i][j] == substring (i,j+1) is palindrome
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int i=s.length()-1;i>=0;i--){
            for(int j=i;j<s.length();j++){
                //check if the two chars are same and
                //if substring len is less than 3 then it is a palindrome
                //or is the substring if substring(i,j) is a palondomr
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j-i<3 || dp[i+1][j-1]);
                
                //if substring check if res is null and add curr substring
                // or check for len of res and curr subtring and add according
                
                if(dp[i][j] && (res == null || j - i + 1>res.length() )){
                    res = s.substring(i,j+1);
                }
            }
        }
        return s.length() == 0 ? "":res;
    }
}
