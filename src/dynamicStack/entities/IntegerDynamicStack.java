package dynamicStack.entities;

import java.util.NoSuchElementException;

public class IntegerDynamicStack {
    private IntegerStackNode top;
    private int elements;

    public IntegerDynamicStack() {
        top = null;
        elements = 0;
    }

    public boolean isEmpty() {
        return elements == 0;
    }

    public void insertTop(int element) {
        IntegerStackNode newNode = new IntegerStackNode(element);
        newNode.setNext(top);
        top = newNode;
        elements++;
    }

    public void removeTop() {
        if (isEmpty()) throw new NoSuchElementException("Stack is empty.");
        top = top.getNext();
        elements--;
    }

    public boolean contains(int element) {
        IntegerStackNode current = top;

        while (current != null) {
            if (current.getELEMENT() == element) return true;
            current = current.getNext();
        }

        return false;
    }

    public int getTop() {
        if (isEmpty()) throw new NoSuchElementException("Stack is empty.");
        return top.getELEMENT();
    }

    @Override
    public String toString() {
        if (isEmpty()) return "Stack: Top -> null -> Bottom\n";

        StringBuilder stackString = new StringBuilder("Stack: Top -> ");
        IntegerStackNode currentNode = top;

        while (currentNode != null) {
            stackString.append(currentNode.getELEMENT()).append(" -> ");
            currentNode = currentNode.getNext();
        }

        stackString.append("Bottom;\nElements: ").append(elements).append("\n");

        return stackString.toString();
    }
}