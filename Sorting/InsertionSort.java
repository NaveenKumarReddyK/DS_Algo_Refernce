public class InsertionSort {
    //iterate and check prev array and increment the post of all eement grater than curr key
    public static void insertionSort(int[] arr){
        int len = arr.length;
        for(int i=1;i<len;i++){
            int key = arr[i];
            int j = i-1;
            //loop throgh prev elemnts
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args){
        int[] arr = {9,8,7,6,5,4,3,2,1};
        insertionSort(arr);
        for (int k: arr){
            System.out.print(k+" ");
        }
    }


}
