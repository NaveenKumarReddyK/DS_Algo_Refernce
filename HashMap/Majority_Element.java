import java.util.HashMap;

public class Majority_Element {
    public static void major(int[] arr){
        HashMap<Integer,Integer> h = new HashMap<Integer, Integer>();

        for(int i=0;i<arr.length;i++){

            if(h.containsKey(arr[i])){
                int count = h.get(arr[i])+1;
              if(count > arr.length/2){
                  System.out.println("Major Element : "+arr[i]);

                  return;
              }
              else{
                  h.put(arr[i],count);
              }
            }
            else{
                h.put(arr[i],1);
            }
        }
        System.out.println("No such element exists");
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,2,2,2,1,1,2,2,2};
        major(arr);
    }
}
