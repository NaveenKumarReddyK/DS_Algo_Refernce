

class Max_Product_Subarray{
    public static void max_prod_sub_arr(int[] nums) {
 
        int len = nums.length;
        int prefix = 1,suffix = 1,max = Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            if(prefix == 0){
                prefix = nums[i]*1;
            }
            else {
                prefix *= nums[i];
            }
            System.out.print(prefix+" ");
            if(suffix == 0){
                suffix = nums[len-i-1]*1;
            }
            else{
                suffix *=nums[len-i-1];
            }
            System.out.print(suffix+" ");
            System.out.println("");
            max = Math.max(max,Math.max(prefix,suffix));
        }
        System.out.println(max);
    
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,-10,0,-20,-30};
        max_prod_sub_arr(arr);
    }
}