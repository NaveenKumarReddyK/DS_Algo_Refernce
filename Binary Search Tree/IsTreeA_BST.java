class IsTreeA_BST {
    public boolean isValidBST(TreeNode root) {
        
      return bst(root,null,null);
    }
    public boolean bst(TreeNode node,TreeNode leftNode,TreeNode rightNode){
        if(node == null){
            return true;
        }
      if(leftNode != null && node.val <= leftNode.val){
          return false;
      }
        if(rightNode != null && node.val >= rightNode.val){
          return false;
      }
        
        return (bst(node.left,leftNode,node) && bst(node.right,node,rightNode));
    }
}
