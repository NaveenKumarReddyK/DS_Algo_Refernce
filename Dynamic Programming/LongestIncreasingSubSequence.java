public class LongestIncreasingSubSequence {
     public int lengthOfLIS(int[] nums) {
        //user binary search
        int len = nums.length;
        int[] dp = new int[len];
        int index = 0;
        for(int num : nums){
            int i = Arrays.binarySearch(dp,0,index,num);
            if(i < 0){
                i = -(i+1);
            }
                dp[i] = num;
                if(i == index){
                        index++;   
                }
        }
        return index;
    }
    public static void main(String[] args){
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60 };
        System.out.println(lengthOfLIS(arr));
    }
}
