package stack.entities;

import java.util.NoSuchElementException;

public class IntegerStack {
    private final Integer[] STACK;
    private final int LENGTH;
    private int elements;
    private Integer top;

    public IntegerStack(int LENGTH) {
        if (LENGTH <= 0) throw new IllegalArgumentException("Length cannot be zero or negative.");

        this.LENGTH = LENGTH;
        STACK = new Integer[LENGTH];
        elements = 0;
        top = null;
    }

    public boolean isEmpty() {
        return elements == 0;
    }

    public boolean isFull() {
        return elements == LENGTH;
    }

    public void push(int element) {
        if (isFull()) throw new IllegalStateException("Stack is full.");

        STACK[elements] = element;
        top = STACK[elements];
        elements++;
    }

    public void pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack is empty.");

        elements--;
        top = elements > 0 ? STACK[elements - 1] : null;
        STACK[elements] = null;
    }

    public boolean contains(int element) {
        for (int i = 0; i < elements; i++) {
            if (STACK[i] == element) {
                return true;
            }
        }

        return false;
    }

    public int getElements() {
        return elements;
    }

    public Integer getTop() {
        return top;
    }

    public int getLENGTH() {
        return LENGTH;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "Stack is empty.\n";

        StringBuilder stackString = new StringBuilder("Top -> ");

        for (int i = elements - 1; i >= 0; i--) {
            stackString.append(STACK[i]);

            if (i > 0) stackString.append(" -> ");
        }

        stackString.append(" -> Bottom\n");

        return stackString.toString();
    }
}