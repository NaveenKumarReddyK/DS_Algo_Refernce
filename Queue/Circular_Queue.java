//Circular Queue
// If front is empty enqueue elements ot front
class CircularQueue{
    int size;
    int arr[];
    int front,rear;
    CircularQueue(int capacity){
        size = capacity;
        front = -1;
        rear = -1;
        arr = new int[capacity];
    }

    public void enqueue(int num){
        if(isFull()){
            System.out.println("Queue is Full");
        }
        else if(front == -1){
            front = 0;
            rear = (rear+1)%size;
            arr[rear] = num;
            System.out.println("Enqueued "+num);
        }
        else{
            rear = (rear+1)%size;
            arr[rear] = num;
            System.out.println("Enqueued "+num);
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty unable to dequeue");
        }
        else{
            System.out.println("Removed "+arr[front]);

            if(front == rear){
                front = -1;
                rear = -1;
            }else{
                front = (front+1)%size;
            }
        }
    }
    public void printCircularQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
            System.out.println("");
        }
    }
    public Boolean isEmpty(){
        if(front == -1 ){
            return true;
        }
        return false;
    }
    public Boolean isFull(){
        if(rear == size-1 && front == 0){
            return true;
        }
        if(front == rear+1){
            return true;
        }
        return false;
    }
    public int size(){
        return size;
    }
}
public class Circular_Queue {
    public static void main(String[] args){
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(6);
        cq.enqueue(5);
        cq.enqueue(4);
        cq.enqueue(3);
        cq.enqueue(2);
        cq.printCircularQueue();
        cq.dequeue();
        cq.dequeue();
        cq.printCircularQueue();


    }

}
