import javax.swing.*;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Most_Frequent {
    public static void mf(int[] arr){
        HashMap<Integer,Integer> ht = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(ht.containsKey(arr[i])){
                int count = ht.get(arr[i])+1;
                ht.put(arr[i],count);
            }
            else{
                ht.put(arr[i],1);
            }
        }
        int result = 0;

        for(int i=1;i<arr.length-1;i++){
            if(ht.get(arr[i]) > ht.get(arr[i-1])){
                result = arr[i];
            }
            else{
                result =  arr[i-1];
            }
        }
        System.out.println("Most occuring number is : "+result);

    }
    public static void main(String[] args){
        int[] arr = {1,2,2,1,2,1,3,2,2,2,2,1};
        mf(arr);
    }
}
