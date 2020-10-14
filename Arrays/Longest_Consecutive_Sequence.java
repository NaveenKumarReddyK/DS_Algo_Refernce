//Link : https://leetcode.com/problems/longest-consecutive-sequence/

//Solution 1
class Solution {
    public int longestConsecutive(int[] nums) {
        //Use HashSet and store all the numbers 
        //check for left and right consecutive numbers
        //if found increment count
        int maxLen = 0;
        HashSet < Integer > set = new HashSet < > ();
        for (int num: nums) {
            set.add(num);
        }
        for (int num: nums) {
            //one because every number is a sequence
            int count = 1;
            //check if number is Integer.MIN_VALUE to avoid underflow 
            if (num != Integer.MIN_VALUE) {
                int tempVal = num - 1;
                while (set.remove(tempVal)) {
                    count++;
                    if(tempVal != Integer.MIN_VALUE){
                          tempVal--;
                          continue;
                    }
                }
            }
            //check if number is Integer.MAX_VALUE to avoid overflow
            if (num != Integer.MAX_VALUE) {
                int tempVal = num + 1;
                while (set.remove(tempVal)) {
                    count++;
                    if(tempVal != Integer.MAX_VALUE){
                        tempVal++;
                        continue;
                    }
                }
            }

            maxLen = Math.max(count, maxLen);
        }
        return maxLen;
    }
}

//Solution 2
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int maxLen = 1;
        int prevNum = nums[0];
        int tempLen = 1;
        for(int i=1; i<nums.length;i++){
            //check for duplicates
            if(nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] == prevNum + 1){
                tempLen++;
                prevNum++;
                maxLen = Math.max(maxLen , tempLen);
            }
            else{
                tempLen = 1;
                prevNum = nums[i];
            }
        }
        return maxLen;
    }
}
