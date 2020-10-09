import java.util.Stack;

class Reverse_Polish_Notation{
    public static int evaluate_string(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(String s : tokens){
            if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")){
                int right = stack.pop();
                int left = stack.pop();
                if(s.equals("+")){
                    stack.push(left + right);
                }
                else if(s.equals("-")){
                    stack.push(left - right);
                }
                else if(s.equals("/")){
                    stack.push(left / right);
                }
                 else if(s.equals("*")){
                    stack.push(left * right);
                }
            }
            else {
                stack.push(Integer.parseInt(s));
            }
        }
        
        return stack.peek();
    }
    public static void main(String[] args){
        String[] expr = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evaluate_string(expr));
    }
}