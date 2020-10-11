/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        //preorder traversal
        //create a string of nodes seperated by ,
        //put # to null valuees
        StringBuilder sb = new StringBuilder();
        preorder(root,sb);
        return sb.toString();
    }
    public void preorder(TreeNode root,StringBuilder sb){
        if(root == null){
            sb.append('#');
            return;
        }
        sb.append(root.val).append(',');
        preorder(root.left,sb);
        sb.append(',');
        preorder(root.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        //convert into queue and add to root
        Queue<String> queue = new LinkedList<>();
        for(String s : data.split(",")){
            queue.offer(s);
        }
        TreeNode root = dfs(queue);
        return root;
    }
    public TreeNode dfs(Queue<String> q){
        String curr = q.poll();
        if(curr.equals("#")){
            return null;
        }
        int value = Integer.valueOf(curr);
        TreeNode root = new TreeNode(value);
        root.left = dfs(q);
        root.right = dfs(q);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
