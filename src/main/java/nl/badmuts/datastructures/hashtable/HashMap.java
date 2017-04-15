package nl.badmuts.datastructures.hashtable;

/**
 * Created by Daanr on 15-Apr-17.
 */
public class HashMap<K, V> {
    private Node<K, V>[] table;
    private int size = 0;
    private static final int MAP_SIZE = 100;

    public HashMap() {
        this.table = new Node[MAP_SIZE];
    }

    public void put(K key, V value) {
        int position = hash(key);
        Node<K, V> item = new Node<>(key, value);
        if (table[position] != null) {
            item.next = table[position];
        } else {
            size++;
        }
        table[position] = item;
    }

    // TODO: 15-Apr-17 Create/find a really good hash function
    private int hash(K key) {
        return Math.abs(key.hashCode() % MAP_SIZE);
    }

    public V get(K key) {
        Node<K, V> currentNode = table[hash(key)];

        if (currentNode == null)
            return null;

        while (currentNode.key != key) {
            currentNode = currentNode.next;
        }

        return (currentNode.value == null) ? null : currentNode.value;
    }

    public int size() {
        return size;
    }

    public void delete(K key) {
        table[hash(key)] = null;
    }

    public class Node<K, V> {
        public K key;
        public V value;
        public Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
