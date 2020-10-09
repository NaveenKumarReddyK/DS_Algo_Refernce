import java.util.Arrays;
public class EvenOddPosttions {
    public static void evenOddPos(int[] arr){
        Arrays.sort(arr);
        //Temp array
        int[] tarr = new int[arr.length];
        int b = arr.length-1;
        int f = 0;
        for(int i=0;i<arr.length;i++){
           if(i%2 == 0){
               //Even Positions
               tarr[i] = arr[b];
               b--;
           }
           else{
               tarr[i] = arr[f];
               f++;
           }
        }
        for(int k:tarr){
            System.out.print(k+" ");
        }

    }
    public static void main(String[] args){
        int[] arr = {1,23,3,2,1,23,43,12,221,123,42,44};
        evenOddPos(arr);
    }
}
