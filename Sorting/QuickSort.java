import com.sun.nio.sctp.AbstractNotificationHandler;

public class QuickSort {
    //find pivot element
    //call quick sort
    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pivot = pivotElement(arr,low,high);

            quickSort(arr,low,pivot-1);//sort left of pivot
            quickSort(arr,pivot+1,high);//sort right of pivot
        }
    }
 
    public static int pivotElement(int[] arr,int low,int high){
        int pElement = arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pElement){
                i++;
                swap(arr[i],arr[j]);

            }
        }
        swap(arr[i+1],arr[high]);
        //swapping final pivot and i+1 pos elements

        return (i+1);
    }
    public static void swap(int n1,int n2){
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

    }
    public static void printArr(int[] arr){
        for(int k: arr){
            System.out.print(k+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {10,9,8,7,6,5,4,3,2,1,11,12};
        int len = arr.length;
        quickSort(arr,0,len-1);
        printArr(arr);
    }
}
