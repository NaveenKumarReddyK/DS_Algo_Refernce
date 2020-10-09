import java.util.*;
import java.util.Stack;

public class Next_Samllest {
    public static void sumSubarrayMins(int[] A) {
        //find next smallest element
        int res = 0;
        int mod = 1000000007;
        int len = A.length;
        int[] small = new int[len];
        Arrays.fill(small,-1);
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<=len;i++){
            while(!s.isEmpty() && A[s.peek()]>(i == len?0:A[i])){
                 int j = s.pop();
                 int k = (s.isEmpty()?-1:s.peek());
                 res = (res+A[i]*(i-j)*(j-k))%mod;
            }
            s.push(i);
        }


//        return res;

    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        sumSubarrayMins(arr);
    }
}