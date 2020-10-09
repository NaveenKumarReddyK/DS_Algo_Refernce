//https://leetcode.com/problems/largest-number/
class Solution {
    public String largestNumber(int[] nums) {
        String[] sArr = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            sArr[i] = Integer.toString(nums[i]);
        }
        //we need to sort numbers according to starting values to get highest number
        //Eg. 947 > 892829 
        //To acheive this we add two string in same and reverse order and then compare
        Arrays.sort(sArr,new Comparator<String>(){
            @Override
            public int compare(String a,String b){
                String s1 = a + b;
                String s2 = b + a;
                return s2.compareTo(s1);
            }
        });
        
        //if large number is zero then all the numbers are zeroes
        //we dont need remaining zeroes "00000" => "0"
        if(sArr[0].equals("0")){
            return "0";
        }
        //Add all the strings 
        StringBuilder sb = new StringBuilder();
        for(String s : sArr){
            sb.append(s);
        }
         
        return sb.toString();
    }
}
