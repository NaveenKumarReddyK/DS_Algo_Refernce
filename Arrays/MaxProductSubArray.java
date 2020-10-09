public class MaxProductSubArray {
    public int maxProduct(int[] nums) {
        //prfix product
        //suffixe product
        //cal max
        int len = nums.length;
        int prefix = 1,suffix = 1,max = Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            if(prefix == 0){
                prefix = nums[i]*1;
            }else{
                prefix *= nums[i];
            }
            if(suffix == 0){
                suffix = nums[len-i-1]*1;
            }else{
                suffix *= nums[len-i-1];
            }

            max = Math.max(max,Math.max(prefix,suffix));
        }
        return max;
    }
}
