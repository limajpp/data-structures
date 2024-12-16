package dynamicStack;

import dynamicStack.entities.IntegerDynamicStack;

import java.util.NoSuchElementException;

public class Debugging {
    public static void main(String[] args) {
        try {
            IntegerDynamicStack dynamicStack = new IntegerDynamicStack();

            System.out.println(dynamicStack);

            dynamicStack.insertTop(1);

            System.out.println(dynamicStack.contains(1) + "\n");
            System.out.println(dynamicStack.getTop() + "\n");

            dynamicStack.insertTop(2);
            dynamicStack.insertTop(3);

            System.out.println(dynamicStack.contains(-1) + "\n");

            dynamicStack.insertTop(4);
            dynamicStack.insertTop(5);

            System.out.println(dynamicStack.getTop() + "\n");

            System.out.println(dynamicStack);

            dynamicStack.removeTop();

            System.out.println(dynamicStack.getTop() + "\n");

            System.out.println(dynamicStack);
        }
        catch (NoSuchElementException exception) {
            System.err.println("Something wrong happened: " + exception.getMessage());
        }
    }
}