package nl.badmuts.datastructures.hashtable;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Daanr on 15-Apr-17.
 */
public class HashTableTest extends TestCase {

    @Test
    public void testHashTable() {
        HashTable<String> table = new HashTable<>();

        String heapsort = "heapsort";
        String mergesort = "mergesort";
        String quicksort = "quicksort";

        table.put(heapsort);
        table.put(mergesort);
        table.put(quicksort);

        assertEquals(table.get(heapsort), heapsort);
        assertEquals(table.get(mergesort), mergesort);
        assertEquals(table.get(quicksort), quicksort);
    }

}
