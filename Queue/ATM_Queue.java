import java.util.*;
public class ATM_Queue {
    public static void findQueue(int[] arr,int X){
        Deque<int[]> q = new LinkedList<>();
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            q.offerLast(new int[]{i+1,arr[i]});
        }
        while(!q.isEmpty()){
            int[] curr_amount = q.pollFirst();
            if(curr_amount[1] > X){
                q.offerLast(new int[]{curr_amount[0],curr_amount[1] - X});
            }
            else{
                l.add(curr_amount[0]);
            }
        }
        for(int val : l){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 0;t<T;t++){
            int len = sc.nextInt();
            int X = sc.nextInt();
            int[] arr = new int[len];
            for(int i=0;i<len;i++){
                arr[i] = sc.nextInt();
            }

            System.out.print("Case #"+(t+1)+": ");
             findQueue(arr,X);
            System.out.println("");
        }
        sc.close();
    }
}
