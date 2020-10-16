//Link : https://leetcode.com/problems/flip-equivalent-binary-trees/

//Iterative 
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root1);
        q.offer(root2);
        while(!q.isEmpty()){
            TreeNode node1 = q.poll();
            TreeNode node2 = q.poll();
            if(node1 == null && node2 == null){
                continue;
            }
            if(!isEqual(node1,node2)){
                return false;
            }
            if(isEqual(node1.left,node2.left) && isEqual(node1.right,node2.right)){
                q.offer(node1.left);q.offer(node2.left);
                q.offer(node1.right);q.offer(node2.right);
            }
            else if(isEqual(node1.left,node2.right) && isEqual(node1.right,node2.left)){
                q.offer(node1.left);q.offer(node2.right);
                q.offer(node1.right);q.offer(node2.left);
            }
            else {
                return false;
            }
        }
        return true;
        
    }
    public boolean isEqual(TreeNode node1,TreeNode node2){
        if(node1 == null && node2 == null){
            return true;
        }
        else if(node1 != null && node2 != null && node1.val == node2.val){
            return true;
        }
        return false;
        
    }
}

//Recursive
class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null){return true;}
        if(root1 == null || root2 == null){return false;}
        if(root1.val != root2.val){return false;}
        return (flipEquiv(root1.left,root2.left) && flipEquiv(root1.right,root2.right)) || 
            (flipEquiv(root1.left,root2.right) && flipEquiv(root1.right,root2.left));
    }
}
