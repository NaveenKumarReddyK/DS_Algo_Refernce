import java.util.ArrayList;
import java.util.HashMap;

public class FIndThreeFactorsInAnArray {
    public static boolean foundMult(int reqNum,int[] arr,ArrayList<Integer> al){



        for(int i=0;i<al.size()-1;i++){
            int quotient = reqNum/arr[i];
            if(al.contains( quotient) && reqNum%arr[i] == 0){
//                System.out.println(quotient+" "+arr[i]);
            return true;
            }
        }
        return false;
    }
    public static void printElements(int reqNum,int[] arr,ArrayList<Integer> al){
        for(int i=0;i<al.size()-1;i++){
            int quotient = reqNum/arr[i];
            if(al.contains( quotient) && reqNum%arr[i] == 0){
                System.out.println(quotient+" "+arr[i]);
                 break;
            }
            continue;
        }

    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int num = 24;

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(arr[0]);
        al.add(arr[1]);
        for(int i=2;i<arr.length;i++){
            int quotient1 = num/arr[i];
            if(num%arr[i] == 0){
               if( foundMult(quotient1,arr,al)){
                   System.out.print(arr[i]+" ");
                   printElements(quotient1,arr,al);

               }
            }
            al.add(arr[i]);
        }
    }
}
