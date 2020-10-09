class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int nodeData){
            data = nodeData;
            next = null;
        }
    }
    //Add Node at head
    void push(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    //Add Node after a certain node
    void addAfter(Node prev_node,int data){
        Node new_node = new Node(data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;

    }
    //Append at end;
    void append(int data){
        Node new_node = new Node(data);
        new_node.next = null;
    }
    //Delete Node At Pos
    void delete(int key){
       Node temp = head;
       Node prev = null;
       if(temp != null && temp.data == key){
          head = temp.next;
          return;
       }
       while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
       }
       prev.next = temp.next;
    }
    //Print Linked List
    public void printLL(){
        Node tempNode = head;
        while(tempNode != null){
            System.out.print(tempNode.data+" ");
            tempNode = tempNode.next;
        }
    }
    //Print data at a pos
    public void llAtPos(int pos){
        Node temp = head;
        if(pos == 0){
            System.out.println(head.data);
        }
        int count = 0;
        while(count != pos){
            temp = temp.next;
            count++;
        }
        System.out.println("Node at pos "+ pos+" : "+temp.data);
    }
    //Remove all duplicates
    public void removeDuplicates(){
        Node curr = head;
        while(curr.next != null){
            Node  temp= curr;
            while(temp != null && temp.data == curr.data){
                temp = temp.next;
            }
            curr.next = temp;   curr = curr.next;


        }
    }
}
class Single_LinkedList {
    public static void main(String[] args){
        LinkedList l = new LinkedList();
        l.push(3);
        l.push(4);
        l.push(5);
        l.push(6);
        l.push(2);
        l.push(3);
        l.push(1);
        l.delete(4);
        l.llAtPos(1);
        l.printLL();


    }
 }
