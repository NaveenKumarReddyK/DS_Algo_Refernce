import java.util.*;
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
public class Postorder_BST {
    public List<Integer> postorderTraversal(TreeNode root) {
        //same as preorder traversal(left <-> right)
        //instead popping out nodes into output list we push them into another stack
         List<Integer> output = new ArrayList<Integer>();
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        
        if(root == null){
            return output;
        }
        s1.add(root);
        while(!s1.isEmpty()){
            TreeNode new_node = s1.pop();
            s2.push(new_node);
            
            if(new_node.left != null){
                s1.push(new_node.left);
            }
            if(new_node.right != null){
                s1.push(new_node.right);
            }
            
            
        }
        
        while(!s2.isEmpty()){
            output.add(s2.pop().val);
        }
        return output;
    }
    public static void main(String[] args){

    }
}
