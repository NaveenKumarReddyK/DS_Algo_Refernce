/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Flattern_MultiLevel_Linkedlist {
    public Node flatten(Node head) {
        Node p = head;//resulting list
        //traverse through the list
        while(p != null){
            //case1: If node has no children
            if(p.child == null){
                p =  p.next;
                continue;
            }
            //case 2: if child is not null
            //step1: traverse to the end of teh child
            Node temp = p.child;
            while(temp.next != null){
                temp = temp.next;
            }
            //step2: connect to the next node of the "p"
            temp.next = p.next; //this is link the child list to main node 
            //step3: connect to the prev
            if(p.next != null){
                p.next.prev = temp;
            }
            //step4: make next of the main pointer to point to child node
            p.next = p.child;
            //step5:link the prev of child(now it is p) pointer to prev pointer
            p.next.prev = p;
            //step6: unlink child pointer
            p.child = null;
        }
        
        //return the head of the linkedlist
        return head;
    }
}
