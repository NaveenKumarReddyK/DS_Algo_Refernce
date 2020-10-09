import java.util.HashSet;
import java.util.Iterator;

class LinkedList1 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int nodeData) {
            data = nodeData;
            next = null;
        }
    }

    //Add Node at head
    void push(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    //Finding Loop In Linked List
    public boolean loopFunction(){
        HashSet<Node> hs = new HashSet<Node>();
        Node temp = head;
        while(temp != null){
            if(hs.contains(temp.next)){
                return true;
            }
            hs.add(temp.next);
            temp.next = temp;
        }
        return false;
    }
    //
}
public class LoopInLinkedList {
    public static void main(String[] args){
        LinkedList1 l = new LinkedList1();
        l.push(20);
        l.push(4);
        l.push(15);
        l.push(10);
        l.head.next.next.next.next = l.head;
        if(l.loopFunction()){
            System.out.println("Loop Found");
        }
        else{
            System.out.println("Loop not found");
        }
    }
}
