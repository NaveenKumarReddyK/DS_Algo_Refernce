public class MinSwapsToSortArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int count = 0;

       for(int i=0;i<arr.length;i++){
           if(arr[i]-1 != i){
               int temp =arr[arr[i]-1]  ;
               arr[arr[i]-1] =  arr[i]  ;
               arr[i] = temp;
               count++;
           }
       }
        System.out.println(count);
    }
}
