package linkedList.entities;

public class IntegerNode {
    private final int ELEMENT;
    private IntegerNode next;

    public IntegerNode(int element) {
        this.ELEMENT = element;
        next = null;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    public int getElement() {
        return ELEMENT;
    }
}