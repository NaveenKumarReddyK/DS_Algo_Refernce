import java.util.*;
public class ZeroesTOEnd {
    public static void zeroFN(int[] arr){
        int nonZeroCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                // Swap arr[nonZeroCount],arr[i];
                int temp;
                temp = arr[nonZeroCount];
                arr[nonZeroCount] = arr[i];
                arr[i] = temp;

                nonZeroCount++;
            }
        }
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {0,2,3,0,7,6,0,6,8,0,8,6};
        zeroFN(arr);
    }
}
