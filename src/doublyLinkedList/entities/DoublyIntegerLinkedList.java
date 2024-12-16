package doublyLinkedList.entities;

import java.util.NoSuchElementException;

public class DoublyIntegerLinkedList {
    private DoublyIntegerNode start;
    private int elements;

    public DoublyIntegerLinkedList() {
        start = null;
        elements = 0;
    }

    public boolean isEmpty() {
        return elements == 0;
    }

    public void insertAtStart(int element) {
        DoublyIntegerNode newNode = new DoublyIntegerNode(element);

        if (!isEmpty()) newNode.setNext(start);

        start = newNode;
        elements++;
    }

    public void removeAtStart() {
        if (isEmpty()) throw new NoSuchElementException("List is empty.");

        start = start.getNext();
        elements--;
    }

    public void insertAtEnd(int element) {
        if (isEmpty()) {
            insertAtStart(element);
            return;
        }

        DoublyIntegerNode newNode = new DoublyIntegerNode(element);
        DoublyIntegerNode currentNode = start;

        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(newNode);
        newNode.setPrevious(currentNode);
        elements++;
    }

    public void removeAtEnd() {
        if (isEmpty()) throw new NoSuchElementException("List is empty.");
        if (elements == 1) {
            start = null;
            elements--;
            return;
        }

        DoublyIntegerNode currentNode = start;

        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        currentNode.getPrevious().setNext(currentNode.getNext());
        elements--;
    }

    public void insertAtIndex(int index, int element) {
        if (index < 0 || index > elements) throw new IndexOutOfBoundsException("Invalid index.");
        if (index == 0) {
            insertAtStart(element);
            return;
        }
        if (index == elements) {
            insertAtEnd(element);
            return;
        }

        DoublyIntegerNode newNode = new DoublyIntegerNode(element);
        DoublyIntegerNode currentNode = start;

        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.getNext();
        }

        newNode.setNext(currentNode.getNext());
        newNode.setPrevious(currentNode);
        currentNode.getNext().setPrevious(newNode);
        currentNode.setNext(newNode);
        elements++;
    }

    public void removeAtIndex(int index) {
        if (index < 0 || index >= elements) throw new IndexOutOfBoundsException("Invalid index.");
        if (index == 0) {
            removeAtStart();
            return;
        }
        if (index == elements - 1) {
            removeAtEnd();
            return;
        }

        DoublyIntegerNode currentNode = start;

        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(currentNode.getNext().getNext());
        currentNode.getNext().setPrevious(currentNode);
        elements--;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "ADTDoublyLinkedList: null <-> null";

        StringBuilder doublyLinkedListString = new StringBuilder("ADTDoublyLinkedList: null <-> ");
        DoublyIntegerNode currentNode = start;

        while (currentNode.getNext() != null) {
            doublyLinkedListString.append(currentNode.getELEMENT()).append(" <-> ");
            currentNode = currentNode.getNext();
        }

        doublyLinkedListString.append(currentNode.getELEMENT()).append(" <-> null\n");
        doublyLinkedListString.append("elements: ").append(elements).append("\n");

        return doublyLinkedListString.toString();
    }
}