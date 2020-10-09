import java.util.Stack;
public class LargestNumberUisngStack {
    public static void largestInStack(Stack s){
        int temp = (int) s.peek();
        s.pop();
       for(int i=0;i<s.size()-1;i++){
            if(temp>(int) s.peek()){
                s.pop();
            }else{
                temp = (int) s.peek();
                s.pop();
            }
       }
       System.out.println(temp);
    }

    //Minimum Number from stack
    public static void minNmberInStack(Stack s){
        int temp = (int) s.peek();
        s.pop();
        for(int i=0;i<s.size();i++){
            if(temp<(int) s.peek()){
                s.pop();
            }else{
                temp = (int) s.peek();
                s.pop();
            }
        }
        System.out.println(temp);
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(6);
        s.push(4);
        largestInStack(s);
        minNmberInStack(s);
    }
}
