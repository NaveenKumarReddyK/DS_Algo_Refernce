import LinkedList.*;

public class SumOfLinkedList {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        l1.push(1);
        l1.push(2);
        l1.push(3);
        l1.push(4);
        l2.push(1);
        l2.push(2);
        l2.push(3);
        l2.push(4);
        LinkedList l3 = new LinkedList();


        while (l1.head.next != null && l2.head.next != null ){
            int sum = l1.head.data + l2.head.data;
            l3.push(sum);
            l1.head = l1.head.next;
            l2.head = l2.head.next;
        }
        l1.printLL();

    }
}
