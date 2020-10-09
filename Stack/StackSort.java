import java.awt.image.ShortLookupTable;
import java.util.Stack;
public class StackSort {
    public static void sortStack(Stack<Integer> s){
        Stack<Integer> tempStack =new Stack<Integer>();
        int temp;
        while(!s.isEmpty()){
            temp = s.pop();
            while(!tempStack.isEmpty() && tempStack.peek()<temp){
                s.push(tempStack.pop());

            }    tempStack.push(temp);

        }
        while (!tempStack.isEmpty()){
            System.out.println(tempStack.pop());

        }

    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(9);
        s.push(4);
        sortStack(s);
    }
}
