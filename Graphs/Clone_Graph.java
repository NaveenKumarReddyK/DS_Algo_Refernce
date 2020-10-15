// Link : https://leetcode.com/problems/clone-graph/

//DFS
class Solution {
    public Node cloneGraph(Node node) {
        HashMap<Node,Node> map = new HashMap<>();
        return clone(node,map);
    }
    public Node clone(Node root, HashMap<Node,Node> map){
        if(root == null){
            return null;
        }
        if(map.containsKey(root)){
            return map.get(root);
        }
         
        map.put(root,new Node(root.val));
        for(Node neighbor : root.neighbors){
                map.get(root).neighbors.add(clone(neighbor,map));
        }
        return map.get(root);
    }
}

//BFS

class Solution {
    public Node cloneGraph(Node node) {
        //add empty nodes with only values in map
        //add the values of neighbours of the node 
        //BFS
        
        //base case 
        if(node == null){
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        HashMap<Node,Node> map = new HashMap<>();
        //make key of the pointing node as empty node with same value
        map.put(node,new Node(node.val));
        while(!queue.isEmpty()){
            Node curr = queue.poll();
            //travse through its neighbours
            for(Node neighbor : curr.neighbors){
                //check if map contains neighbor node
                if(!map.containsKey(neighbor)){
                    map.put(neighbor,new Node(neighbor.val));
                    //add it in queue 
                    queue.offer(neighbor);
                }
                //fill its neighbors list
                map.get(curr).neighbors.add(map.get(neighbor));
            }
        }
        
        //finally return new root of cloned graph
        return map.get(node);
    }
}
