import java.util.*;
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

public class Populating_Next_Node {
    public static Node connect(Node root) {
        //BFS
       if(root == null){
           return null;
       }
       
       Queue<Node> q = new LinkedList<>();
       q.add(root);
       root.next = null;
       while(!q.isEmpty()){
           int level = q.size();
           Node temp_node = null;
           while(level>0){
              
               if(temp_node == null){
                   temp_node = q.poll();
               }
               else{
                   temp_node.next = q.poll();
                   temp_node = temp_node.next;
               }
               
               if(temp_node.left != null){
                   q.add(temp_node.left);
               }
               if(temp_node.right != null){
                   q.add(temp_node.right);
               }
               level--;
           }
       }
       
       return root;
   }
}
