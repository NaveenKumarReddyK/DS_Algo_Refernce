// Main Idea: 
// To get left position : we need to check the mid value with "HIGH" i.e, nums[mid] >= target then high = mid-1
// To get right positoin : we need to check mid value with "LOW" i.e, nums[mid] <= target then low = mid + 1

class FindFirst_and_Last_Position_of_Element_in_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {
        //finding the first postion --> normal binary seach
        //finding the last postion  --> modified binary search
        //boolean utility to check if the target is at first or last
        int firstPos = binarySearch(nums,target,false);
        int lastPos = binarySearch(nums,target,true);
        return new int[]{firstPos,lastPos};
    }
    public int binarySearch(int[] arr,int target,boolean isEnd){
        int low = 0;
        int high = arr.length - 1 ;
        int index = -1;
        while(low <= high){
            int mid = (low + high) >>> 1;
            if(isEnd){
                //To get leftMost value
                // > to check if there are any elements to the right of low
                if(arr[mid] <= target){
                   low = mid + 1;
                }
                else{
                    hgih = mid - 1;
                }
            }
            else{
                //To get right most value
                // >=  to check if there are any elements to the left of hgih
                if(arr[mid] >= target){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            if(arr[mid] == target){
                index  = mid;
            }
        }
        return index;
    }
}
