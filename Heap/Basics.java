import java.util.*;


public class Basics {
        public static void main(String[] args){
            PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
            PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
            int arr [] = {3,2,1,7,8,4,10,16,12};
            for(int i=0;i< arr.length;i++){
                maxHeap.add(arr[i]);
                minHeap.add(arr[i]);
            }
            Iterator it = minHeap.iterator();
            while (it.hasNext()){
                System.out.print(it.next()+" ");
            }

        }
}
