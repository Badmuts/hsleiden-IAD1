package nl.badmuts.datastructures.hashtable;

/**
 * Created by Daanr on 15-Apr-17.
 */
public class Entry<T> {
    public T item;
    public Entry next;

    public Entry(T item, Entry next) {
        this.item = item;
        this.next = next;
    }

    public Entry(T item) {
        this.item = item;
        this.next = null;
    }
}
