package queue;

import queue.entities.*;

public class Debugging {
    public static void main(String[] args) {
        try {
            IntegerQueue queue = new IntegerQueue(10);

            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);
            queue.enqueue(5);
            queue.enqueue(6);

            System.out.println(queue);

            queue.dequeue();
            queue.dequeue();
            queue.dequeue();

            System.out.println(queue);

            System.out.println(queue.getFirstElement());
            System.out.println(queue.contains(5));
        }
        catch (IllegalArgumentException | IllegalStateException exception) {
            System.out.println("Something wrong happened: " + exception.getMessage());
        }
    }
}