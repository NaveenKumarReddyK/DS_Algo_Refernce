class Solution {
   public int getMinimumDifference(TreeNode root) {
       TreeNode prev = null;
       int min = Integer.MAX_VALUE;
       Stack<TreeNode> s = new Stack<>();
      
       while(!s.isEmpty() || root != null){
           while(root != null){
               s.push(root);
               root = root.left;
           }
           TreeNode popped = s.pop();
           if(prev != null){
               min = Math.min(min,popped.val - prev.val);
           }
           prev = popped;
           root = popped.right;
       }
       return min;
   }
}
