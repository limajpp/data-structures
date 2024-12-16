package unorderedPriorityQueue;

import unorderedPriorityQueue.entities.*;

public class Debugging {
    public static void main(String[] args) {
        try {
            IntegerUnorderedPriorityQueue queue = new IntegerUnorderedPriorityQueue(5);

            System.out.println(queue.isEmpty());
            System.out.println(queue.isFull());
            System.out.println(queue);

            queue.enqueue(1);
            queue.enqueue(-2);
            queue.enqueue(-3);
            queue.enqueue(9);
            queue.enqueue(4);

            System.out.println(queue);

            queue.dequeue();

            System.out.println(queue);

            queue.dequeue();

            System.out.println(queue);

            queue.enqueue(76);

            System.out.println(queue);

            System.out.println(queue.contains(75));
            System.out.println(queue.contains(76));
        }
        catch (RuntimeException exception) {
            System.err.println("Something wrong happened: " + exception.getMessage());
        }
    }
}