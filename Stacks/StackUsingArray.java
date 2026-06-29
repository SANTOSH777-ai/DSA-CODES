class stack {
    int[] arr;
    int top;
    int size;

    stack(int size) {
        arr = new int[size];
        top = -1;
        this.size = size;
    }

    void push(int num) {
        if(top == size - 1) {
            System.out.println("Stack is overflowing");
            return;
        }

        top++;
        arr[top] = num;
    }

    int pop() {
        if(top == -1) {
            System.out.println("Stack got empty");
            return -1;
        }

        int removed = arr[top];
        top--;
        return removed;
    }

    int peek() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    void display() {
        for(int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}


public class Main {
    public static void main(String[] args) {

        stack s = new stack(5);

        s.push(10);
        s.push(20);
        s.push(33);

        System.out.println("Top element: " + s.peek());

        System.out.println("Removed: " + s.pop());

        s.display();
    }
}
