public class Search_Element_In_Sorted_Array {
    public static int findElement(int[] arr,int low,int high,int val){
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid] == val){
            return mid;
        }
        if(arr[low]<=arr[mid]){
            if(val > arr[low] && val < arr[mid]){
                return findElement(arr,low,mid-1,val);
            }
            return findElement(arr,mid+1,high,val);
        }

        if(val > arr[mid] && val < arr[high]){
            return findElement(arr,mid,high-1,val);
        }
        return findElement(arr,mid+1,high,val);
    }
    public static void main(String[] args){
        int[] arr = {3,4,5,1,2};
        int element = 6;
        if(findElement(arr,0,arr.length-1,element) == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at Index : "+findElement(arr,0,arr.length-1,element));
        }
    }
}
