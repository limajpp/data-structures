package doublyLinkedList;

import doublyLinkedList.entities.*;

import java.util.NoSuchElementException;

public class Debugging {
    public static void main(String[] args) {
        try {
            DoublyIntegerLinkedList doublyLinkedList = new DoublyIntegerLinkedList();

            doublyLinkedList.insertAtStart(1);
            doublyLinkedList.insertAtStart(2);
            doublyLinkedList.insertAtStart(3);
            doublyLinkedList.insertAtStart(4);
            doublyLinkedList.insertAtStart(5);

            System.out.println(doublyLinkedList);

            doublyLinkedList.removeAtStart();
            doublyLinkedList.removeAtStart();
            doublyLinkedList.removeAtStart();

            System.out.println(doublyLinkedList);

            doublyLinkedList.insertAtEnd(5);
            doublyLinkedList.insertAtEnd(4);
            doublyLinkedList.insertAtEnd(3);

            System.out.println(doublyLinkedList);

            doublyLinkedList.removeAtEnd();
            doublyLinkedList.removeAtEnd();

            System.out.println(doublyLinkedList);

            doublyLinkedList.insertAtIndex(1, 0);
            doublyLinkedList.insertAtIndex(1, 5);

            System.out.println(doublyLinkedList);

            doublyLinkedList.removeAtIndex(2);
            doublyLinkedList.removeAtIndex(2);

            System.out.println(doublyLinkedList);
        }
        catch (NoSuchElementException | IndexOutOfBoundsException exception) {
            System.err.println("Something wrong happened: " + exception.getMessage());
        }
    }
}