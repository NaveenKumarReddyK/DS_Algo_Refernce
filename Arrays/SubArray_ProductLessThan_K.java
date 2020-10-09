public class SubArray_ProductLessThan_K {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int start = 0;
        int len = nums.length;
        int prod = 1;
        for(int end = 0;end<len;end++){
            prod*=nums[end];
            while(start<end && prod>=k){
                prod = prod/nums[start++];
            }
            if(prod<k){
                count += end - start +1;// +1 because of start == end condition
                //if the element is single element end - start = 0 but we shoud increment count
            }
        }
        return count;
    }
}
