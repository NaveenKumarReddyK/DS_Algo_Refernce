import java.util.*;
public class Russian_Dolls {
    public static void main(String[] args) {
        int[][] envelopes = {{5,4},{6,10}};
        List<int[]> list = new ArrayList<>();
        if(envelopes.length == 0){
//            return 0;
            return;
        }
        for(int[] arr : envelopes){
            list.add(arr);
        }
        Collections.sort(list, new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int [] b){
                return (a[0] != b[0]) ? (a[0] - b[0] ): (b[1] - a[1]);
            }
        });

        int len = 0;
        int[] dp = new int[envelopes.length];
        for(int[] arr : list){
            int i = Arrays.binarySearch(dp,0,len,arr[1]);
            if(i<0){
                i = -(i+1);
            }
            dp[i] = arr[1];
            if(i == len){
                len++;
            }
        }
//        return len;
        System.out.println(len);

    }

}
