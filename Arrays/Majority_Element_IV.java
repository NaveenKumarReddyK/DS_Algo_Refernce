// FIND MAJORTY ELEMENT WITH OCCURENCE GRATER THAN n/4 TIMES
public class Majority_Element_IV {
    public static void majority_IV(int[] arr){
        //Boyer-Moore Voting Algorithm
        //atmost 3 elements can have elements frequency  grater than n/4
        Integer e1 = null,e2 = null, e3 = null;
        int count1 = 0 ,count2 = 0,count3 = 0;
        for(int n : arr){
            if( e1 !=null && n == e1){count1++;}
            else if( e2 !=null && n == e2){count2++;}
            else if( e3 !=null && n == e3){count3++;}
            else if(count1 == 0){e1 = n;count1++;}
            else if(count2 == 0){e2 = n;count2++;}
            else if(count3 == 0){e3 = n;count3++;}
            else{count1--;count2--;count3--;}
        }
        count1 = 0;count2 = 0;count3 = 0;
        for(int n : arr){
            if(e1 == n){count1++;}
            else if(e2 == n){count2++;}
            else if(e3 == n){count3++;}
        }
        int len = arr.length;
        if(count1 > len/3){System.out.println(e1);}
        if(count2 > len/3){System.out.println(e2);}
        if(count3 > len/3){System.out.println(e3);}
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,2,2,2,2,2,3};
        majority_IV(arr);
    }
}
