// Basic search with resulting value to be position of target itself
class Binary_Search {
    public int basic_search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            // int mid = low + (high - low)/2;
            int mid = (low + high) >>> 1;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
        
    }

// Finding the first number to the left of the given target
public int left_search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int index = -1;
        while(low <= high){
            // int mid = low + (high - low)/2;
            int mid = (low + high) >>> 1;
            if(nums[mid] >= target){
                high = mid-1;
            }
            else{
                index = mid;
                low = mid+1;
            }
        }
        return index;
    }
   
// Finding the first number to the left of the given target
public int right_search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int index = -1;
        while(low <= high){
            // int mid = low + (high - low)/2;
            int mid = (low + high) >>> 1;
            if(nums[mid] <= target){
                low = mid+1;
            }
            else{
                index = mid;
                high = mid-1;
            }
        }
        return index;
    }
}
