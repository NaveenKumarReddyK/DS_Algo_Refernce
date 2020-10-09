import com.sun.source.tree.Tree;

class BST_In_Pos{
    TreeNode root;
    class TreeNode {

         int val;
         TreeNode left,right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode buildTree(int[] inorder, int[] postorder) {
            int inStart = 0;
            int inEnd = inorder.length-1;
            int pStart  = 0;
            int pEnd = postorder.length-1;
            return  buildRecursive(inorder,postorder,inStart,inEnd,pStart,pEnd);
        }
        public TreeNode buildRecursive(int[] inorder,int[] postorder,int inStart,int inEnd,int pStart,int pEnd){
            if(inStart > inEnd || pStart > pEnd){
                return null;
            }
            int rootPos = 0;
            TreeNode root = new TreeNode(postorder[pEnd]);
            int k=0;
            for(int i=0;i<inorder.length;i++){
                if(inorder[i] == postorder[pEnd]){
                    k = i;
                }
            }

            root.left = buildRecursive(inorder,postorder,inStart,k-1,pStart,pStart+k-(inStart+1));

            root.right = buildRecursive(inorder,postorder,k+1,inEnd,pStart+k-inStart,pEnd-1);
            return root;
        }
    }
}

class BST_From_Inorder_PostOrder {
 public static void main(String[] args){
     int[] inputArray = {};
     BST_In_Pos bt = new BST_In_Pos() ;

 }
}