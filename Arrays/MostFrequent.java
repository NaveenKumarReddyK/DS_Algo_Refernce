import java.util.HashMap;
import java.util.Map;

public class MostFrequent {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,3,3,4,4};
        HashMap<Integer,Integer> h = new  HashMap<Integer,Integer>();

        h.put(arr[0],1);
        for(int i=1;i<arr.length;i++){

            if(h.containsKey(arr[i])){
                int count = h.get(arr[i]);
                h.put(arr[i],count+1);
            }
            else{
                h.put(arr[i],1);
            }
	//h.put(arr[i],h.getOrDefault(arr[i],0)+1);

        }

        Map.Entry<Integer,Integer> tempValue = null;

        for( Map.Entry<Integer,Integer> mp : h.entrySet()){

            if(tempValue == null  ){
                tempValue = mp;
            }
            else if((mp.getValue() - tempValue.getValue())>0){// Reverse it to get minimum value
                tempValue = mp;
            }

        }
        System.out.println("Most Frequent Numer : "+tempValue.getKey());
        System.out.println("Occurence of number  : "+tempValue.getValue());

    }
}
