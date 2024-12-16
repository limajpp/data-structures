package doublyLinkedList.entities;

public class DoublyIntegerNode {
    private final int ELEMENT;
    private DoublyIntegerNode next, previous;

    public DoublyIntegerNode(int ELEMENT) {
        this.ELEMENT = ELEMENT;
        next = null;
        previous = null;
    }

    public int getELEMENT() {
        return ELEMENT;
    }

    public DoublyIntegerNode getNext() {
        return next;
    }

    public void setNext(DoublyIntegerNode next) {
        this.next = next;
    }

    public DoublyIntegerNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyIntegerNode previous) {
        this.previous = previous;
    }
}