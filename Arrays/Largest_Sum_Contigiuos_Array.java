import java.util.Arrays;

public class Largest_Sum_Contigiuos_Array {
    public static int lagestSum(int[] arr){
        int max_before = arr[0];
        int max_till_now =arr[0];
        Arrays.sort(arr);
        max_before =  arr[arr.length-1];
        return  max_before ;
    }
    public static void main(String[] args){
        int [] a = {-3,-2,-1};
        System.out.println("Maximum contiguous sum is " +
                lagestSum(a));
    }
}
