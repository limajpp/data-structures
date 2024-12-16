package list.entities;

import list.exceptions.*;

public class IntegerList {
    private final int[] LIST;
    private final int LENGTH;
    private int elements;

    public IntegerList(int LENGTH) throws NegativeArraySizeException, ZeroListSizeException {
        elements = 0;

        if (LENGTH < 0) throw new NegativeArraySizeException("Invalid array size.");
        if (LENGTH == 0) throw new ZeroListSizeException("Invalid array size.");

        this.LENGTH = LENGTH;
        LIST = new int[LENGTH];
    }

    public boolean isEmpty() {
        return elements == 0;
    }

    public boolean isFull() {
        return elements == LENGTH;
    }

    public void insertAtStart(int element) throws ListFullException {
        if (isFull()) throw new ListFullException("Cannot add element at the start. The array is full.");

        for (int i = elements; i > 0; i--) {
            LIST[i] = LIST[i - 1];
        }

        LIST[0] = element;
        elements++;
    }

    public void removeAtStart() throws EmptyListException {
        if (isEmpty()) throw new EmptyListException("Cannot remove element at the start. The array is empty.");

        for (int i = 0; i < elements; i++) {
            LIST[i] = LIST[i + 1];
        }

        elements--;
    }

    public void insertAtEnd(int element) throws ListFullException {
        if (isFull()) throw new ListFullException("Cannot add element at the end. The array is full.");

        LIST[elements] = element;
        elements++;
    }

    public void removeAtEnd() throws EmptyListException {
        if (isEmpty()) throw new EmptyListException("Cannot remove element at the end. The array is empty");

        LIST[elements - 1] = 0;
        elements--;
    }

    public void insertAtIndex(int index, int element) throws ListFullException, IndexOutOfBoundsException {
        if (isFull()) throw new ListFullException("Cannot add element at index: " + index + ". The array is full.");

        if (index == elements) {
            insertAtEnd(element);
            return;
        }
        else if (index < 0) throw new ArrayIndexOutOfBoundsException("Invalid index.");
        else if (index > elements) throw new IndexOutOfBoundsException("Cannot add element after the end of elements.");

        for (int i = elements; i > index; i--) {
            LIST[i] = LIST[i - 1];
        }

        LIST[index] = element;
        elements++;
    }

    public void removeAtIndex(int index) throws EmptyListException, IndexOutOfBoundsException {
        if (isEmpty()) throw new EmptyListException("cannot remove element at index: " + index +
                ". The array is empty.");

        if (index >= elements) throw new IndexOutOfBoundsException("Cannot remove no element.");
        else if (index < 0) throw new ArrayIndexOutOfBoundsException("Invalid index.");

        for (int i = index; i < elements; i++) {
            LIST[i] = LIST[i + 1];
        }

        elements--;
    }

    @Override
    public String toString() {
        StringBuilder stringList = new StringBuilder("[");
        int lastIndex = LENGTH - 1;

        for (int currentIndex = 0; currentIndex < LENGTH; currentIndex++) {
            if (currentIndex == lastIndex) {
                stringList.append(LIST[currentIndex]).append("];");
                break;
            }

            stringList.append(LIST[currentIndex]).append(", ");
        }

        return "LIST: " + stringList + "\n" +
                "LENGTH: " + LENGTH + ";\n" +
                "elements: " + elements + ".\n";
    }
}