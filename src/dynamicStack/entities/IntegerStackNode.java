package dynamicStack.entities;

public class IntegerStackNode {
    private final int ELEMENT;
    private IntegerStackNode next;

    public IntegerStackNode(int element) {
        this.ELEMENT = element;
        next = null;
    }

    public int getELEMENT() {
        return ELEMENT;
    }

    public IntegerStackNode getNext() {
        return next;
    }

    public void setNext(IntegerStackNode next) {
        this.next = next;
    }
}