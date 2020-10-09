import java.util.Scanner;
public class Delete_Alternate {
    static Node head;
    static class Node{
        Node next;
        int val;
        Node(int val){
            this.val = val;
            next  = null;
        }
    }
    static void push(int data){
        Node curr = new Node(data);
        curr.next = head;
        head = curr;
    }
    static void print(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }

    }
    static void deleteAlternate(Node head){
        Node prev = head;
        Node curr = head.next;
        while(curr!= null && prev != null){
            prev.next = curr.next;
            prev = prev.next;
            curr = null;
            if (prev != null){
                curr = prev.next;
            }
        }
        print(head);

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i=0;i<len;i++){
            arr[i]  = sc.nextInt();
        }
        for (int num : arr){
            push(num);
        }
        print(head);
        System.out.println("");
        //dleelting alternate nodes
        deleteAlternate(head);

    }
}
