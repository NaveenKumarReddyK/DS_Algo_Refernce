//Link : https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/

class Solution {
    //Preorder Traversal
    //Kepp Track of Levels (add levels at each iteration)
    //Keep track of distances from root nodes
    Map<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map;
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if (root == null){
            return null;
        }
            
         map  = new TreeMap<>();
        dfs(root, 0, 0);
        List<List<Integer>> res = new ArrayList<>();
        for (int key : map.keySet()){
            List<Integer> list = new ArrayList<>();
            TreeMap<Integer, PriorityQueue<Integer>> tm = map.get(key);
            for (int k : tm.keySet()){
                PriorityQueue<Integer> pq = tm.get(k);
                while (!pq.isEmpty()){
                    list.add(pq.poll());
                }
            }
            res.add(list);
        }
        return res;
    }
    
    private void dfs(TreeNode root, int index, int level){
        if (root == null)
            return;
        
        map.putIfAbsent(index, new TreeMap<>());
        map.get(index).putIfAbsent(level, new PriorityQueue<>());
        map.get(index).get(level).add(root.val);
        dfs(root.left, index - 1, level + 1);
        dfs(root.right, index + 1, level + 1);
    }
}
