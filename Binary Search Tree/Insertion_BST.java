public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }
public class Insertion_BST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode(val);
            return root;
        }
        TreeNode curr = root;
        TreeNode parent = null;
        while(curr != null){
            if(curr.val<val){
                parent = curr;
                curr = curr.right;
            }
            else{
                parent = curr;
                curr = curr.left;
            }
        }
        
        if(parent.val<val){
            parent.right = new TreeNode(val);
        }
        else{
            parent.left = new TreeNode(val);
        }
        
        return root;
    }
    public static void main(String[] args){

    }
}
