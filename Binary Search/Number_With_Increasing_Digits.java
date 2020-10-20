// Link : https://leetcode.com/discuss/interview-question/900939/SAP-2021-Full-Time-USA/738061

public class Solution {
    public static void generateNums(List<Integer> list,int len,int prev,int comb){
        if(len == 0){
            list.add(comb);
            return;
        }
        for(int i = prev + 1;i<=9;i++){
            //recusively add all the numbers of given length
            generateNums(list,len-1,i,comb*10 + i);
        }
    }
    public static int getSmallest(List<Integer> list,int val){
        //finding the first number to the left of given result using binary search
        int low = 0;
        int high = list.size()-1;
        int index = list.size() -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(list.get(mid) >= val){
                high = mid - 1;
            }
            else{
                index = mid;
                low = mid +1;
            }
        }
        return list.get(index);
    }
    public static void main(String[] args) {
        //generate all the possible values upto 1,000,000
         List<Integer> list = new ArrayList<>();
        for(int i=1;i<7;i++){
            int len = i;
            int prev = 0;
            int comb = 0;
        generateNums(list,len,prev,comb);
        }
        System.out.print(getSmallest(list,998));
    }
}
