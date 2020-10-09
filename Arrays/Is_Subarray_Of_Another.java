 
public class Is_Subarray_Of_Another {
    public static boolean is_subarray_util(int[] arr,int[] sub_arr){
            int len1 = arr.length;
            int len2 = sub_arr.length;
            int i=0,j=0;
            while(i<len1 && j<len2){
                if(arr[i] == sub_arr[j]){
                    i++;
                    j++;
                    if(j == len2){
                        return true;
                    }
                }
                else{
                    i = i - j +1;
                    j = 0;
                }
            }
            return false;
    }
    public static void main(String[] args){
            int[] arr1 = {1,2,3,4,5,6};
            int[] arr2 = {4,5,6};
            System.out.println(is_subarray_util(arr1,arr2));
    }
}
