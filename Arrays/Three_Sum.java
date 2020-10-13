import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Three_Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        //subtract each number and search for 2 elements in remaining array
        List<List<Integer>> outList = new ArrayList<List<Integer>>();
        for(int j=0;j<nums.length-1;j++){
            List<Integer> currList = findTwoSum(-nums[j],nums,j+1);
            if(currList != null){
                currList.add(nums[j]);

                outList.add(currList);
            }
        }
        return outList;
    }
    public static List<Integer> findTwoSum(int sum,int[] arr,int start){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer> list = new ArrayList<Integer>();
        map.put(arr[start],start);
        for(int i=start;i<arr.length;i++){
            if(map.containsKey(sum-arr[i])){
                list.add( sum-arr[i] );
                list.add(arr[i]);
                return list;
            }
            map.put(arr[i],i);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }

}
