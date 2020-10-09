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
public class Preorder_BST {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        if(root == null){
            return output; 
        }
        s.add(root);
        
        while(!s.isEmpty()){
            TreeNode new_node = s.pop();
            output.add(new_node.val);
            if(new_node.right != null){
                s.push(new_node.right);
            }
            if(new_node.left != null){
                s.push(new_node.left);
            }
            
        }
        return output;
        
    }
    public static void main(String[] args){

    }
}
