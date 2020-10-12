// Link : https://leetcode.com/problems/path-sum-ii/

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        //DFS
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        dfs(root,sum,res,new ArrayList<Integer>());
        return res; 
    }
    public void dfs(TreeNode node,int sum,List<List<Integer>> res,List<Integer> comb){
        if(node == null){
            return ;
        }
        //add the curr value
        comb.add(node.val);
        if(node.left == null && node.right == null){
            if(node.val == sum){ //sum == 0
            res.add(new ArrayList<Integer>(comb));
            return;
        }
        }
        //if left subtree is not null
        if(node.left != null){
            dfs(node.left,sum - node.val,res,comb);
            //remove the last element (backtracking)
            comb.remove(comb.size()-1);
        }
        //is right subtree is not null
        if(node.right != null){
            dfs(node.right,sum - node.val,res,comb);
            //remove last value
            comb.remove(comb.size()-1);
        }
    }
}
