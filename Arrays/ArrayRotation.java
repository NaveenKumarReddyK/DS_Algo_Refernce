import java.io.BufferedReader;
import java.util.*;

public class ArrayRotation {

    public static void rotateLeft(int[] arr, int start,int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateArray(int[] arr,int d,int n){
        rotateLeft(arr,0,d-1);
        rotateLeft(arr,d,n-1);
        rotateLeft(arr,0,n-1);
        for(int k:arr){
            System.out.print(k+" ");
        }
    }

    public static void main(String args[]){

        int[] arr = {1,2,3,4,5};
        rotateArray(arr,2,5);
    }
}
