package hashTable.entities;

public class IntegerHashTable {
    private final Integer[] HASH_TABLE;
    private final int LENGTH;
    private int elements;

    public IntegerHashTable(int LENGTH) {
        if (LENGTH <= 0) throw new IllegalArgumentException("Invalid length value.");
        this.LENGTH = LENGTH;
        HASH_TABLE = new Integer[LENGTH];
        elements = 0;
    }

    public boolean isEmpty() {
        return elements == 0;
    }

    public boolean isFull() {
        return elements == LENGTH;
    }

    private int hashFunc(int element) {
        return element % LENGTH;
    }

    public boolean contains(int element) {
        if (isEmpty()) throw new IllegalStateException("HashTable is currently empty.");

        int key = hashFunc(element);
        return HASH_TABLE[key] == element;
    }

    public Integer search(int key) {
        if (key < 0 || key >= LENGTH) throw new IllegalArgumentException("Invalid key.");

        return HASH_TABLE[key];
    }

    public void insert(int element) {
        if (isFull()) throw new IllegalStateException("HashTable is currently full.");

        int key = hashFunc(element);
        HASH_TABLE[key] = element;
        elements++;
    }

    public void remove(int element) {
        if (isEmpty()) throw new IllegalStateException("HashTable is currently empty.");

        int key = hashFunc(element);
        if (HASH_TABLE[key] == null) throw new IllegalStateException("The element does not exist in the HashTable.");
        HASH_TABLE[key] = null;
        elements--;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "The HashTable is empty.\n";

        StringBuilder hashTableString = new StringBuilder("HashTable - {\n");
        for (int i = 0; i < LENGTH; i++) {
            hashTableString.append("    Key ").append(i).append(": [")
                    .append(HASH_TABLE[i] != null ? HASH_TABLE[i] : "null")
                    .append("]\n");
        }
        hashTableString.append("}\n");
        hashTableString.append("LENGTH: ").append(LENGTH).append("\n").append("elements: ").append(elements)
                .append("\n");

        return hashTableString.toString();
    }
}