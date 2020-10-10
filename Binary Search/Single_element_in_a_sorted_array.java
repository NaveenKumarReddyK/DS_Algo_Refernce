class Single_element_in_a_sorted_array {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while(low < high){
            int mid = (low + high) >>> 1;
            if(mid %2 == 0){
                if(nums[mid] == nums[mid +1]){
                    low = mid +2;
                }
                else{
                    high = mid;
                }
            }
            else{
                if(nums[mid] == nums[mid-1]){
                    low = mid + 1;
                }
                else{
                    high = mid;
                }
            }
        }
        return nums[low];
    }
}
