import java.util.*;
class Count_Triplets{
    public static long countTriplets(List<Long> arr, long r) {
        long res = 0;
        // a/r ,a , ar
        HashMap<Long,Integer> right = new HashMap<>();
        HashMap<Long,Integer> left =  new HashMap<>();
        for(long num : arr){
            right.put(num,right.getOrDefault(num,0)+1);
        }

        for(int i=0;i<arr.size();i++){
        
        if(right.get(arr.get(i))  == 0  ){
            right.remove(arr.get(i));
        }
        else{
            right.put(arr.get(i),right.get(arr.get(i))-1);
        }

        if(arr.get(i) % r == 0){
             
            long ci = left.containsKey(arr.get(i) / r)  == true ? left.get(arr.get(i) / r)  : 0;
            long cj = right.containsKey(arr.get(i) * r) == true ? right.get(arr.get(i) * r) : 0;
            res += ci * cj;

        }
        left.put(arr.get(i),left.getOrDefault(arr.get(i),0)+1);

        }
        return res;

    }
    public static void main(String[] args){
            
            List<Long> list = new ArrayList<>(); 
            long[] arr = {1,2,4,6,8,16,32,64};
            for(long curr : arr){
                list.add(curr);
            }
            long r = 4;
            System.out.println(countTriplets(list,r));
    }
}