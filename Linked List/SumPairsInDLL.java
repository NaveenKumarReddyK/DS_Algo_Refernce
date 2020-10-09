class DLL1{
    Node head = null;
    class Node{
        Node next = null;
        Node prev = null;
        int data;
        Node(int node_data){
            data = node_data;
        }
    }
    public void push(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
        }
        else{
            new_node.next = head;
            new_node.prev = null;
            head.prev = new_node;
            head = new_node;
        }
    }
    public void sumPair(int sum){
        Node front =  head;
        Node back = head;
        Boolean sumFound = false;
        while(back != null){
            back = back.next;
        }
    while (front!= null && back != null && back.next!= front && front!= back){
        if((front.data + back.data) == sum){
            sumFound = true;
            System.out.println("( "+front.data+" , "+back.data+" )");
            front = front.next;
            back = back.prev;
        }
        else {
            if((front.data + back.data )< sum){
                front = front.next;

            }else {
                back = back.prev;
            }
        }


    } if(sumFound == false){
            System.out.println("No sum pair exists");
        }
    }
    public void printDLL(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
public class SumPairsInDLL {
    public static void main(String[] args){
        DLL1 d = new DLL1();
        d.push(1);
        d.push(3);
        d.push(2);
        d.push(1);
        d.sumPair(3);
        d.printDLL();
    }
}
