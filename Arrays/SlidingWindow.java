public class SlidingWindow {
    //To find max sum of K consequtive numbers
    public static void sWindow(int[] arr,int d){
        int max_sum = 0;
       if(arr.length>d){
           for(int i=0;i<d-1;i++){
               max_sum+=arr[i];
           }
       }
       int temp_sum = max_sum;
       for(int j=d;j<arr.length;j++){
           temp_sum = temp_sum+arr[j]-arr[j-d];
           max_sum = Math.max(temp_sum,max_sum);
       }
       System.out.print("Max Sum : "+max_sum);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,4,3,2,1,4,5,6,4,2,3,5,6};
        int pos = 4;
        sWindow(arr,pos);
    }
}
