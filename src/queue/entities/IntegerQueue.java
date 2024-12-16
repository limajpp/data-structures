package queue.entities;

public class IntegerQueue {
    private final int[] QUEUE;
    private final int LENGTH;
    private int elements, start, end;

    public IntegerQueue(int LENGTH) {
        if (LENGTH <= 0) throw new IllegalArgumentException("Invalid length.");

        this.LENGTH = LENGTH;
        QUEUE = new int[LENGTH];

        elements = 0;
        start = 0;
        end = 0;
    }

    public boolean isEmpty() {
        return elements == 0;
    }

    public boolean isFull() {
        return elements == LENGTH;
    }

    public void enqueue(int element) {
        if (isFull()) throw new IllegalStateException("Queue is full.");

        QUEUE[end] = element;

        end = (end + 1) % LENGTH;
        elements++;
    }

    public void dequeue() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty.");

        start = (start + 1) % LENGTH;
        elements--;
    }

    public int getFirstElement() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty.");

        return QUEUE[start];
    }

    public boolean contains(int element) {
        if (isEmpty()) return false;

        for (int i = 0; i < elements; i++) {
            int index = (start + i) % LENGTH;
            if (QUEUE[index] == element) return true;
        }

        return false;
    }

    @Override
    public String toString() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty.");

        StringBuilder staticQueueString = new StringBuilder("First -> ");

        for (int i = 0; i < elements; i++) {
            int index = (start + i) % LENGTH;
            staticQueueString.append(QUEUE[index]);

            if (i == elements - 1) {
                staticQueueString.append(" -> Last");
            }
            else {
                staticQueueString.append(" -> ");
            }
        }

        return staticQueueString.toString();
    }
}