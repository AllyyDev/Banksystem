package myqueue;

public class MyQueue {

    int[] queue;
    int rear;
    int front;
    int size;

    public MyQueue(int sizeOfArr) {
        queue = new int[sizeOfArr];
        rear = -1;
        front = -1;
        size = 0;
    }

    public boolean isEmpty() {
        boolean response = false;
        if(size == 0) {
            response = true;
        }
        return response;
    }

    public boolean enqueue(int element) {
        boolean response = false;
        if(rear != queue.length - 1) {
            rear++;
            queue[rear] = element;
            size++;
            response = true;
        }
        return response;
    }

    public int dequeue() {
        int response = 0;
        if(size != 0) {
            front++;
            response = queue[front];
            size--;
        }
        return response;
    }

    public int peek() {
        int response = 0;
        if(! isEmpty()) {
            response = queue[front + 1];
        }
        return response;
    }

    public int getSize() {
        return size;
    }

}
