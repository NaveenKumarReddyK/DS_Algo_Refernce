//Reference : https://algorithms.tutorialhorizon.com/print-all-combinations-of-subset-of-size-k-from-given-array/
public class Print_All_Subsets {
    public static void subsets(int[] arr,int start,int kLength,int currlength,boolean[] bArr){
        if(currlength == kLength ){
            for(int i=0;i<arr.length;i++){
                if(bArr[i] == true){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println("");
            return;
        }

        if(start == arr.length){
            return;
        }

        //Selected curr element

        bArr[start] = true;
        subsets(arr,start+1,kLength,currlength+1,bArr);

        //We donot select curr element

        bArr[start] = false;
        subsets(arr,start+1,kLength,currlength,bArr);
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int subsetSize = 3;
        boolean[] B = new boolean[arr.length];
        subsets(arr,0,subsetSize,0,B);
    }


}
