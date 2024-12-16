package unorderedPriorityQueue.entities;

public class IntegerUnorderedPriorityQueue {
    private final Integer[] QUEUE;
    private final int LENGTH;
    private int elements;
    private Integer prioElement;
    private Integer prioElementIndex;

    public IntegerUnorderedPriorityQueue(int LENGTH) {
        if (LENGTH <= 0) throw new IllegalArgumentException("Invalid length. It must be bigger than zero.");

        this.LENGTH = LENGTH;
        QUEUE = new Integer[LENGTH];
        elements = 0;
        prioElement = null;
        prioElementIndex = null;
    }

    public boolean isEmpty() {
        return elements == 0;
    }

    public boolean isFull() {
        return elements == LENGTH;
    }

    private void updatePriority() {
        prioElement = QUEUE[0];
        prioElementIndex = 0;

        for (int i = 1; i < elements; i++) {
            if (QUEUE[i] > prioElement) {
                prioElement = QUEUE[i];
                prioElementIndex = i;
            }
        }
    }

    public void enqueue(int element) {
        if (isFull()) throw new IllegalStateException("Queue is full.");

        QUEUE[elements] = element;
        elements++;
        updatePriority();
    }

    public void dequeue() {
        if (isEmpty()) throw new IllegalStateException("List is empty.");

        for (int i = prioElementIndex; i < elements - 1; i++) {
            QUEUE[i] = QUEUE[i + 1];
        }

        elements--;
        updatePriority();
    }

    public boolean contains(int element) {
        for (int i = 0; i < elements; i++) {
            if (QUEUE[i].equals(element)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "priorityQueue: []\n";

        StringBuilder priorityQueueString = new StringBuilder("priorityQueue: [");

        for (int i = 0; i < elements; i++) {
            if (i == elements - 1) {
                priorityQueueString.append(QUEUE[i]).append("]\n");
                break;
            }

            priorityQueueString.append(QUEUE[i]).append(", ");
        }

        priorityQueueString.append("LENGTH: ").append(LENGTH).append("\n");
        priorityQueueString.append("elements: ").append(elements).append("\n");
        priorityQueueString.append("prioElement: ").append(prioElement).append("\n");
        priorityQueueString.append("prioElementIndex: ").append(prioElementIndex).append("\n");

        return priorityQueueString.toString();
    }
}