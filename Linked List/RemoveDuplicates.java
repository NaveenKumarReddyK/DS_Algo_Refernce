import java.sql.SQLOutput;
import java.util.HashSet;

class LL{
    Node head ;
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void insert(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new_node;
    }

    public Node removeDuplicates(){
        HashSet<Integer> hs = new HashSet<>();
        if(head == null){
            return head;
        }
        Node frontNode = head;
        Node prevNode = null;
        while (frontNode != null){
            if(hs.contains(frontNode.data)){
                prevNode.next = frontNode.next;
            }
            else{
                hs.add(frontNode.data);
               prevNode = frontNode;
            }
            frontNode = frontNode.next;
        }
        return head;
    }

    public void printLinkedList(Node head){
        if(head == null){
            System.out.println("Linked List id Empty");
        }
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}

public class RemoveDuplicates {

    public static void main(String[] args){
        LL l = new LL();
        l.insert(3);
        l.insert(4);
        l.insert(3);
        l.insert(5);
        l.insert(6);
        l.insert(7);
        l.printLinkedList(l.removeDuplicates());
    }
}
