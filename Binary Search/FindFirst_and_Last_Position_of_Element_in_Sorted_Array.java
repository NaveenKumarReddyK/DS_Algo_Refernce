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
                // > to check if there are any elements to the right of low
                if(arr[mid] > target){
                   high = mid -1;
                }
                else{
                    low = mid +1;
                }
            }
            else{
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
