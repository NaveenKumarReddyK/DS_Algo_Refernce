//https://leetcode.com/problems/trapping-rain-water/
public class Trapping_Rain_Water {
    public static int trap(int[] height) {
        int res = 0;
        int size = height.length;
        if(size == 0 || size == 1){
            return 0;
        }
        int[] left = new int[size];
        int[] right = new int[size];
        left[0] = height[0];
        for(int i=1;i<size;i++){
            left[i] = Math.max(height[i],left[i-1]);
        }
        right[size-1] = height[size-1];
        for(int i=size-2;i>=0;i--){
            right[i] = Math.max(height[i],right[i+1]);
        }

        for(int i=1;i<size-1;i++){
            res+=Math.min(left[i],right[i])-height[i];
        }
        return res;
    }

  
    public static int trapRainWater(int[] arr){
        int size = arr.length;
        int res = 0;
        if(size == 0 || size == 1){
            return res;
        }
        int leftMax = 0;//Max val till the left of currVal
        int rightMax = 0;// Max val till right of the curr
        int left = 0;//left pointer
        int right = size-1;//right pointer
        while(left<right){
            if(arr[left]>=arr[right]){
                if(arr[left]>=leftMax){
                      leftMax = arr[left];

                }
                else  {
                    res+=leftMax-arr[left];

                }
                right--;
            }
            else{
                if(arr[right] >= rightMax){
                   rightMax = arr[right];
                }
                else{
                    res+=rightMax-arr[right];
                }
                left++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
            int[] rainWater = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println( trapRainWater(rainWater));
    }
}
