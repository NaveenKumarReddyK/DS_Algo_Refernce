import java.lang.Math;
public class LOngestSubesquence {
    public static void lss(String s1,String s2){
        // if equal then add diagonal element
        //If not equal max(left,top)
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        int[][] arr = new int[arr1.length+1][arr2.length+1] ;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(i == 0 || j == 0){
                    arr[i][j] = 0;
                }
                else if(arr1[i-1] == arr2[j-1]){
                    arr[i][j] = arr[i-1][j-1];
                }
                else {
                    arr[i][j] = Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        System.out.println(arr[arr1.length][arr2.length]);
    }
    public static void main(String[] args){
        String s1 = "NAVEEN";
        String s2 = "NAVEENS";
        lss(s1,s2);
    }
}
