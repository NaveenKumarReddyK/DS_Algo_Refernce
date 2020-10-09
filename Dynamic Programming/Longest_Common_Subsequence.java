import java.lang.Math;
public class Longest_Common_Subsequence {
    public static void lss(String s1,String s2){
        // if equal then add diagonal element
        //If not equal max(left,top)
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        int[][] dp = new int[arr1.length+1][arr2.length+1] ;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
                else if(arr1[i-1] == arr2[j-1]){
                    dp[i][j] = dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[arr1.length][arr2.length]);
    }
    public static void main(String[] args){
        String s1 = "NAVEEN";
        String s2 = "NAVEENS";
        lss(s1,s2);
    }
}
