 
import java.util.*;

public class BinaryWithNoConsequtiveOnes {
    public static long binaryNum(int count){
        int num =   1;
        String bString = Integer.toBinaryString(num);
        for(int i=0;i<count-1;i++){
            while(bString.indexOf("11") >=0 ){
                num++;
                bString = Integer.toBinaryString(num);
            }
             
            bString = Integer.toBinaryString(++num);
        }
        while(bString.indexOf("11") >=0 ){
            bString = Integer.toBinaryString(num++);
        }
        long res = Long.parseLong(bString);
        return res;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
         long start = System.nanoTime();
        for(int num : arr){
            System.out.println(binaryNum(num));
        }
        long end = System.nanoTime();
        System.out.println("Executed in : "+(end - start)%11 +"ms");
         
    }
}
