import java.util.HashSet;

class Pll{
    Pll.Node head ;
    class Node{
        Pll.Node next;
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
        Pll.Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new_node;
    }

    public void printLinkedList(Pll.Node head){
        if(head == null){
            System.out.println("Linked List id Empty");
        }
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public Node reverseLinkedList(Node headPointer){
        Node curr = headPointer;
        Node prev = null;
        Node next = null;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        headPointer = prev;
        return headPointer;
    }

    public boolean isPlaindrome(Node head1,Node head2){

        while ((head1.next != null) && (head2.next != null)){
            if(head1.data != head2.data){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }
}


public class PalindromeLinkedList {
    public static void main(String[] args) {
        Pll linkedList = new Pll();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(2);

        if(linkedList.isPlaindrome(linkedList.head,linkedList.reverseLinkedList(linkedList.head))){
            System.out.println("Linked list is Palindrome");
        }
        else{
            System.out.println("Linked list is not Palindrome");
        }
    }
}
