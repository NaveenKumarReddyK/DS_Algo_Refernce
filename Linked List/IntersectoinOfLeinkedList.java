class LL2{
    Node head;
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

    public void intersection(Node head1,Node head2){
        Node lastNode1 = lastNode(head1);
        Node lastNode2 = lastNode(head2);
        if(lastNode1 != lastNode2){
            System.out.println("Linked Lists do not interset");
            return;
        }
        Node maxLLNode = (lengthOfLL(head1)>lengthOfLL(head2))? head1 : head2;
        Node minLLNode = (lengthOfLL(head1)>lengthOfLL(head2))? head2 : head1;

        int advanceLength = Math.abs(lengthOfLL(head1) - lengthOfLL(head2));
        while (advanceLength>0 && maxLLNode != null){
            maxLLNode = maxLLNode.next;
            advanceLength--;
        }

        while (minLLNode != maxLLNode){
            minLLNode = minLLNode.next;
            maxLLNode = maxLLNode.next;
        }

        System.out.println("Intersection at "+ maxLLNode.data);
    }

    public int lengthOfLL(Node headNode){
        Node temp = headNode;
        int count = 0;
        while (temp.next != null){
            count++;
        }
        return count;
    }
    public Node lastNode(Node start){
        Node lastNode = start;
        while (lastNode.next != null){
            lastNode = lastNode.next;
        }
        return lastNode;
    }
}
public class IntersectoinOfLeinkedList {
    public static void main(String[] args) {
        LL2 l1 = new LL2();
        LL2 l2 = new LL2();
        l1.insert(3);
        l1.insert(1);
        l1.insert(5);
        l1.insert(9);
        l1.insert(7);
        l1.insert(2);
        l1.insert(1);
        l2.insert(4);
        l2.insert(6);
        l2.insert(7);
        l2.insert(2);
        l2.insert(1);

        l1.intersection(l1.head,l2.head);



    }
}
