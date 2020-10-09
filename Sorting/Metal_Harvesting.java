import java.util.*;
public class Metal_Harvesting {
    public static void metal_hearvest_util(int[][] arr,int maxTime){
        Arrays.sort(arr,(a,b)->{
            return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
        });
        int res = 0;
        int index = 0;
        int start = arr[0][0];
        int end = arr[0][0]+maxTime;
        while(index<arr.length){
            int currStart = arr[index][0];
            int currEnd = arr[index][1];
            if(currStart <= )
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++ ){
            int len = sc.nextInt();
            int maxTime = sc.nextInt();
            int[][] arr = new int[len][2];
            for(int i=0;i<len;i++){
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            metal_hearvest_util(arr,maxTime);
        }
    }
}

