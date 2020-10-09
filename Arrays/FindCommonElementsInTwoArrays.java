import java.util.ArrayList;

public class FindCommonElementsInTwoArrays {
    public static void findCommonElements(int[] A,int[] B) {
         int len1 = 0;
         int len2 = 0;
         if(A.length>=B.length){
             len1 = A.length;
             len2 = B.length;
         }
         else{
             len1 = B.length;
             len2 = A.length;
         }
        ArrayList<Integer> al = new ArrayList<Integer>();
        int i=0,j=0;//i for maxArray, j for minArray
        while(i<len1 && j<len2){
            if(A[i] == B[j]){
                al.add(A[i]);
                i++;
                j++;
            }
            else if(A[i]>B[j]){
                j++;
            }
            else {
                i++;
            }
        }
        for(int k : al){
            System.out.print(k+" ");
        }

    }
    public static void main(String[] args) {
        int[] A = {1,3,4,6,7,9,10,11,12};
        int[] B = {1,2,4,5,9,10};

        findCommonElements(A,B);
    }
}
