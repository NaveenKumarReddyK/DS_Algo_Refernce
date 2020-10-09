import java.util.*;
public class Citations {
    public static void hIndex(int[] arr) {
        Arrays.sort(arr);

        int i=0;
        HashMap<Integer,int[]> map = new HashMap<>();//less,greater
        int len = arr.length;
        while(i<len){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],new int[]{i,len-i});
            }
            else{
                int[] newArr = map.get(arr[i]);
                map.put(arr[i],new int[]{newArr[0],newArr[1]});
            }
            i++;
        }
//        System.out.println(map);/
        for (Map.Entry<Integer,int[]> m:map.entrySet()){
            int[] larr =  m.getValue();
            System.out.println(m.getKey()+" "+(int) larr[0] +" "+(int) larr[1] );
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,0,6,1,5};
        //0,1,3,5,5,5,6
    hIndex(arr) ;
    }
}
