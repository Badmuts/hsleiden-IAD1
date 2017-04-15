package nl.badmuts.datastructures.hashtable;

/**
 * Created by Daan on 15-Apr-17.
 */
public class HashTable<T> {
    private Entry[] list;
    private final int TABLE_SIZE = 10; // currently hard coded

    public HashTable() {
        this.list = new Entry[TABLE_SIZE];
    }

    /**
     * Put item in HashTable.
     *
     * @param item
     */
    public void put(T item) {
        int position = hash(item);
        Entry<T> wrapper = new Entry<>(item);
        if (list[position] != null) {
            wrapper.next = list[position];
        }
        list[position] = wrapper;
    }

    /**
     * Generates hash for given string to store in HashTable.
     *
     * @param item
     * @return int
     */
    private int hash(T item) {
        return Math.abs(item.hashCode() % TABLE_SIZE);
    }

    /**
     * Retrieve item from HashTable.
     *
     * @param item
     * @return T
     */
    public T get(T item) {
        int position = hash(item); // position of item in HashTable
        int hash = item.hashCode(); // unique hash of item

        Entry currentNode = list[position];

        while (currentNode.item.hashCode() != hash) { // iterate through all entries until found
            currentNode = currentNode.next;
        }

        return (T) currentNode.item;
    }

}
