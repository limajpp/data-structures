package linkedList;

import linkedList.entities.*;

import java.util.NoSuchElementException;

public class Debugging {
    public static void main(String[] args) {
        // Debugging...
        try {
            IntegerLinkedList linkedList = new IntegerLinkedList();

            System.out.println(linkedList.isEmpty());

            System.out.println();

            linkedList.insertAtStart(1);
            linkedList.insertAtStart(2);

            System.out.println(linkedList);

            linkedList.insertAtEnd(3);
            linkedList.insertAtEnd(4);

            System.out.println(linkedList);

            linkedList.insertAtIndex(2, 19);
            linkedList.insertAtIndex(2, 78);

            System.out.println(linkedList);

            linkedList.removeAtStart();

            System.out.println(linkedList);

            linkedList.removeAtEnd();
            linkedList.removeAtEnd();

            System.out.println(linkedList);

            linkedList.removeAtIndex(1);

            System.out.println(linkedList);

            linkedList.removeAtIndex(0);

            System.out.println(linkedList);
        }
        catch (NoSuchElementException | IndexOutOfBoundsException exception) {
            System.err.println("Something wrong happened: " + exception.getMessage());
        }
    }
}