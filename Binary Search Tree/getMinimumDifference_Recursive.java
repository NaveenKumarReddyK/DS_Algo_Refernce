class Solution {
    int min = Integer.MAX_VALUE;
    TreeNode prev = null;
    public int getMinimumDifference(TreeNode root) {
        //inorder traversal
        inorder(root);
        return min;
    }
    public void inorder(TreeNode node){
        if(node == null){
            return;
        }
        inorder(node.left);
        if(prev != null){
            min = Math.min(min,node.val - prev.val);
        }
        prev = node;
        inorder(node.right);
    }
}
