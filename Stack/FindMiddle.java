
import java.util.Stack;
public class FindMiddle {
    public static void findMiddle(Stack s){
        int count = 0;
        int x = 0;
        while(count != s.size()/2 && count<s.size()){
             x = (int) s.pop();
            s.push(x);
            count++;
        }
        System.out.println(x);
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<Integer>();
        s.push(4);
        s.push(3);
        s.push(2);
        findMiddle(s);
    }
}
