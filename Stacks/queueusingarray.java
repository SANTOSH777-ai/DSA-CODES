class Queue{
    int [] arr;
    int front;
    int rear;
    int size;
    Queue(int size){
        arr = new int[size];
        this.size = size;
        front = 1;
        rear = -1;
    }
    void enqueue(int num){
        if(rear == size -1){
            System.out.println("Queue overflow");
            return;
        }
        if(front == -1){
            front = 0;
        }
        rear++;
        arr[rear] = num;
    }
    void dequeue(){
        if(front == -1 || front > rear){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(arr[front] + " is removed.");
        front++;
        if(front > rear){
            front = rear = -1;
        }

    }
    int peek(){
        if(front == -1){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class queueusingarray{
    public static void main(String[] args){
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();

        q.display();

        System.out.println("Front element: " + q.peek());
    }
}
