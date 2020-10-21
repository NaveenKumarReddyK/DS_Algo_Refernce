// Definition for a binary tree node.
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution {
    //to get the position of the node we need to get the binary representaion of the number 
    public static boolean nodeExists(TreeNode root,int position ){
        //get the binary representatio of the position
        String binary = Integer.toBinaryString(position);
        //start from second position as the root sits at first position
        for(int i=1;i<binary.length();i++){
            if(root == null){
                return false;
            }
            else if(binary.charAt(i) == '0'){
                root = root.left;
            }
            else{
                root =  root.right;
            }
        }
        return root != null;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        System.out.println(nodeExists(root,6));
    }
}
