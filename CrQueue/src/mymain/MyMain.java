package mymain;

import myqueue.MyQueue;
public class MyMain {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(10);
        System.out.println(queue.enqueue(1000));
        System.out.println(queue.enqueue(2000));
        System.out.println(queue.enqueue(500));
        System.out.println(queue.getSize());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue() + " deleted from the list");
    }
}
