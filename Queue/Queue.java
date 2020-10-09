class Queue{
    int arr[];
    int front,rear;
    int size;
    Queue(int queueSize){
        front = -1;
        rear = -1;
        size = queueSize;
        arr = new int[queueSize];
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        System.out.println(arr[front]);
    }
    public void enqueue(int num){
        if(isFull()){
            System.out.println("Queue is Full");
        }
        else if(front == -1){
            front = 0;
            rear++;
            arr[rear] = num;
            System.out.println("Added to Queue with front = -1");
        }
        else{
            rear++;
            arr[rear] = num;
            System.out.println("Added to Queue");
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty and unable to Dequeue Element");
        }
        else{System.out.println("Removed "+arr[front]);
            if(front>=rear){

                front = -1;
                rear = -1;
            }
            else{

                front++;
            }
        }
    }
    public Boolean isFull(){
        if(front == 0 && rear == size-1){
            return true;
        }
        return false;
    }
    public Boolean isEmpty(){
        if(front == -1 && rear == -1){
            return true;
        }
        return false;
    }
    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty ,Unable to print anything");
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println( " ");
    }

}
public class Queue {
    public static void main(String[] args){
        Queue q = new Queue(5);
        q.enqueue(5);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(1);
        q.printQueue();
        q.dequeue();
        q.dequeue();
        q.printQueue();



    }
}
