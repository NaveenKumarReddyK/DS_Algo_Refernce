public class LongestIncreasingSubSequence {
    public static void liss(int[] arr){
        int len = arr.length;
        int[] lis = new int[len];
        for(int i=0;i<len;i++){
            lis[i] = 1;
        }

        for(int i=1;i<len;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && lis[i]<lis[j]+1){
                    lis[i] = lis[j]+1;
                }
            }
        }
        System.out.println(lis[len-1]);
    }
    public static void main(String[] args){
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60 };
        liss(arr);
    }
}
