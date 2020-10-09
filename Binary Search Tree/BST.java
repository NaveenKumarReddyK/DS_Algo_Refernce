import javax.swing.text.html.HTMLDocument;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.util.LinkedList;
import java.util.Queue;

class BSTree{
    Node root;
    class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    public Node insertNode(Node root,int data){
        Node new_node = new Node(data);
        if(root == null){
            root = new_node;
            return root;
        }
       else{
            if(data < root.data){
                root.left = insertNode(root.left,data);
            }
            if(data > root.data){
                root.right = insertNode(root.right,data);
            }
            return root;
        }

    }
    public void insert(int data){
        root = insertNode(root,data);
    }
    public int height(Node root){
        if(root == null || root.left == null && root.right == null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }

    //Level order traversal of tree

    public void levelOrderTraversal(Node root){
        Queue<Node> q = new LinkedList<Node>();
        if(root == null){
            return;
        }
        q.add(root);
        int level = 0;
        while(!q.isEmpty()){
            level = q.size();
            while (level>0){
                Node new_node = q.poll();
                System.out.print(new_node.data+" ");
                if(new_node.left != null){
                    q.add(new_node.left);
                }
                if(new_node.right != null){
                    q.add(new_node.right);
                }

                level--;
            }
        }
    }

}
public class BST {
    public static void main(String[] args){
        BSTree bt = new BSTree();
        bt.insert(3);
        bt.insert(5);
        bt.insert(2);
        bt.insert(1);
        bt.insert(4);
        bt.insert(6);
        bt.insert(7);
        System.out.println("BST height : "+bt.height(bt.root));
        System.out.println("");
        bt.levelOrderTraversal(bt.root);
    }
}
