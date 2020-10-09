import java.util.Stack;
import java.util.Scanner;

public class Balanced_Paranthesis {
    static Boolean isBalncedPaanthesis(char arr[]){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == '{' || arr[i] == '[' || arr[i] == '('){
                stack.push(arr[i]);
            }
            else if(arr[i] == '}' || arr[i] == ']' || arr[i] == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                else if(!(stack.pop() == arr[i])){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        else{
            return true;
        }

    }
public static void main(String[] args){

    char arr[] = {'{','(','[',']',')','}'};

    if(isBalncedPaanthesis(arr)){
        System.out.println("Balanced Paranthesis ");
    }
    else{
        System.out.println("Un Balanced Paranthesis ");
    }
}
}
