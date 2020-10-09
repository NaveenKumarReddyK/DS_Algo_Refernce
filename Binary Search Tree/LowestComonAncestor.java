class LCS_BST{
    Node root;
    class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    public Node insertNode(Node root, int data){
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

    public Node lcs(Node root,int num1,int num2){
        while (root!= null){
            if(root.data>num1 && root.data>num2){
                root = root.left;
            }
            else if(root.data<num1 && root.data<num2){
                root = root.right;
            }
            else {
                break;
            }

        }
        return root;

    }
}

public class LowestComonAncestor {
    public static void main(String[] args) {
        LCS_BST bTree = new LCS_BST();
        bTree.insert(20);
        bTree.insert(8);
        bTree.insert(22);
        bTree.insert(4);
        bTree.insert(12);
        bTree.insert(10);
        bTree.insert(14);


    }
}
