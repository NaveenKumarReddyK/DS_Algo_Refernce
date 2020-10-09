import java.util.Iterator;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class QueuUsingStack {
    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<Integer>();
        while (!q.isEmpty()){
            s.push(q.poll());
        }
        while (!s.isEmpty()){
            q.add(s.pop());
        }
        Iterator i = q.iterator();
        while (i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println("");
    }
    public static void printQueue(Queue<Integer> q1){
        Iterator i = q1.iterator();
        while (i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        printQueue(q);

        reverseQueue(q);
    }
}
