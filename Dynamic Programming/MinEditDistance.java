import java.lang.Math;
public class MinEditDistance {
    public static void minDis(String s1,String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        int[][] dp = new int[len1][len2];

        for(int i=0;i<len1;i++){
            for (int j=0;j<len2;j++){
                if(i == 0){
                    dp[i][j] = j;
                }
                else if(j == 0){
                    dp[i][j] = i;
                }
                else{
                    if(s1.charAt(i-1) == s2.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1];
                    }
                    else{
                        dp[i][j] = Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
                    }
                }
            }
        }
        System.out.println(dp[len1-1][len2-1]);
    }
    public static void main(String[] args){
        String s1 = "sunday";
        String s2 = "saturday";
        minDis(s1,s2);
    }

}
