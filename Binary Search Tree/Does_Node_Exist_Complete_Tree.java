// Definition for a binary tree node.
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Solution {
 //SOLUTION 1 :
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
 //SOLUTION 2 : 
 //to get the position of the node we need to get the binary representaion of the number 
    //divde the number by 2 and store them in stack to traverse to the position in tree
    public static boolean doesNodeExists(TreeNode root,int position){
        //get the divided values in a stack
        Stack<Integer> stack = new Stack<>();
        while(position != 1){
            stack.push(position);
            position = position/2;
        }
        //traverse through stack and is num leaves rem 0 when divides by 2 => go left || go right
        while(!stack.isEmpty()){
            root = (stack.pop() %2 == 0) ? root.left : root.right;
            if(root == null){
                return false;
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
       System.out.println(doesNodeExists(root, 5));
    }
}
