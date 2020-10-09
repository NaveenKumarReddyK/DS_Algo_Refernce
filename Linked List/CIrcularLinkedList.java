class CircularLL{
    Node head = null;
    Node tail = null;
    class Node{
        Node next;
        int data;
        Node(int node_data) {
            data = node_data;
            next = null;
        }
    }
    public void push(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            tail = new_node;
            new_node.next = head;
        }
        else{
            new_node.next = tail.next;
            tail.next = new_node;
        }
    }
    public void printCLL(){
        Node temp = head;
        do{
            System.out.println(temp.data);
            temp = temp.next;
        }while (temp!= head);
    }
}
public class CIrcularLinkedList {
    public static void main(String[] args){
        CircularLL c = new CircularLL();
        c.push(5);
        c.push(3);
        c.printCLL();
    }
}
