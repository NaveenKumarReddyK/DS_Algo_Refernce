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
public class Inorder_BST {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        if(root == null){
            return output; 
        }
       while( root != null || !s.isEmpty()){
           
           while(root != null){
               s.push(root);
               root = root.left;
           }
           root = s.pop();
           output.add(root.val);
           root = root.right;
       }
        

        return output;
    }    public static void main(String[] args){

    }
}
