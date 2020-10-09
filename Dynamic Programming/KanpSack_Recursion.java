public class KnapSack_Recursion {
    public static int ksr(int[] W,int[] V,int i,int totalWeight ){
        if(totalWeight == 0 ||i <0){
            return 0;
        }
        if(totalWeight>W[i]){
            return ksr(W,V,i-1,totalWeight);
        }
        return Math.max(ksr(W,V,i-1,totalWeight),V[i]+ksr(W,V,i-1,totalWeight-W[i]));
    }

    public static void main(String[] args){
        int[] W = {1,2,4,2,5};
        int[] V = {5,3,5,3,2};
        int totalWeight = 9;
        System.out.println(ksr(W,V,W.length-1,totalWeight));
    }
}
