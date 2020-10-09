class LL{
    Node head = null;
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    //Queue Enqueu == Add at front
    public void enQueue(int data){
        Node new_node = new Node(data);
        if(head == null){
            head.next = new_node;
        }
        head.next = new_node;
        head = new_node;
    }
    //Deueue
    public void deQueue(){
        Node tempNode1 = head;
        Node tempNode2 = null;
        tempNode2 = tempNode1.next;
        tempNode1 = tempNode2;
    }
}
public class QueueWithLL {
}
