package list;

import list.entities.IntegerList;
import list.exceptions.*;

public class Debugging {
    public static void main(String[] args) {
        // Debugging...
        try {
            IntegerList list = new IntegerList(10);

            list.insertAtStart(1);
            list.insertAtStart(12);
            list.insertAtStart(11);
            list.insertAtStart(29);
            list.insertAtStart(8);

            System.out.println(list);

            list.insertAtEnd(98);
            list.insertAtEnd(38);
            list.insertAtEnd(41);

            System.out.println(list);

            list.removeAtStart();
            list.removeAtStart();

            System.out.println(list);

            list.removeAtEnd();
            list.removeAtEnd();

            System.out.println(list);

            list.insertAtIndex(4, 50);
            list.insertAtIndex(4, 89);

            System.out.println(list);

            list.removeAtIndex(2);
            list.removeAtIndex(2);

            System.out.println(list);
        }
        catch (EmptyListException | ListFullException | IndexOutOfBoundsException | ZeroListSizeException |
               NegativeArraySizeException exception) {
            System.err.println("Something wrong happened: " + exception.getMessage());
        }
    }
}