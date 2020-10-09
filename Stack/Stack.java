import java.util.*;
class Stack{
    int arr[];
    int size;
    int top;

    Stack(int stackSize){
        arr = new int[stackSize];
        size = stackSize;
        top = -1;
    }

    public void push(int num){
        if(isFull()){
            System.out.println("Stack is full");
            System.exit(1);
        }
        arr[++top] = num;
        System.out.println("Added "+num+" to Stack ");
    }
    public void pop(int num){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            System.exit(1);

        }
        System.out.println(arr[top--]);
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("Empty Stack, Unable to Peek");
            System.exit(1);
        }
        System.out.println(arr[top]);
    }
    public Boolean isEmpty(){
        return top == -1;
    }
    public Boolean isFull(){
        return top == size-1;
    }
    public int stackSize(){
        return top+1;
    }
    public void printStack(){
        for(int i=0;i<arr.length;i++){
            System.out.println("| "+arr[i]+"| ");
            System.out.println(" __");
        }
    }
}
//Main Class
public class Stack {
    public static void main(String[] args){
        Stack s = new Stack(5);
//        s.peek();
        s.push(5);
        s.push(4);s.push(3);s.push(2);s.push(1);
        s.peek();
        s.printStack();
        s.pop(3);
        s.peek();
    }
}
