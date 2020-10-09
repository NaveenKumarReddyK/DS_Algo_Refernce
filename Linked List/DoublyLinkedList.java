class DLL{
    Node head = null;
    class Node{
        Node next = null;
        Node prev = null;
        int data;
        Node(int node_data){
            data = node_data;
        }
    }
    public void addFront(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        new_node.prev = null;
        if(head != null){
            head.prev = new_node;
        }
        head = new_node;
    }
    public void addAfter(Node prev_node,int data){
        Node new_node = new Node(data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
        new_node.prev = prev_node;
       if(new_node.next != null){
           prev_node.next.prev = new_node;
       }
    }
    public void addAtEnd(int data){
        Node new_node = new Node(data);
        Node last = head;
        while(last!=null){
            last = last.next;
        }
        last.next = new_node;
        new_node.prev = last;
        new_node.next = null;
        last = new_node;

    }
    public void reversDLL(){
        //Swap next and previous of all nodes
        Node temp = null;
        Node current = head;
        while ((current != null)) {

            temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = current.next;
        }

    }
}
public class DoublyLinkedList {
}
