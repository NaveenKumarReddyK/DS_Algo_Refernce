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
public class Deletion_BST {
    public static TreeNode delete(TreeNode root,int key){
            //traverse to the postion where the node is to be deleted
            //replace with the next smallest node in right subtree

            if(root.val < key){//grater
                root.right = delete(root.right, key);
            }
            else if(root.val > key){//lesser
                root.left = delete(root.left, key);
            }
            else{
                //if key is same as node val
                //check for null values
                if(root.left == null){
                    return root.right;
                }
                else if(root.right == null){
                    return root.left;
                }
            }

            //find min node in right subtree and replace it with next smaller node
            TreeNode minNode  = findMin(root);
            root.val = minNode.val;
            root.right = delete(root.right, key);

            return root;
    }
    public static TreeNode findMin(TreeNode node){
        while(node != null){
            node = node.left;
        }
        return node;
    }
    public static void main(String[] args){

    }
}
