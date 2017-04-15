package nl.badmuts.datastructures.hashtable;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Daanr on 15-Apr-17.
 */
public class HashMapTest extends TestCase {
    HashMap<String, String[]> map;
    String[] heapsort;
    String[] mergesort;
    String[] quicksort;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        map = new HashMap<>();
        heapsort = new String[]{"Best case: O(n log(n))", "Worst case: O(n log(n))", "Average case: O(n log(n))"};
        mergesort = new String[]{"Best case: ", "Worst case: ", "Average case: "};
        quicksort = new String[]{"Best case: ", "Worst case: ", "Average case: "};

        for (int i = 0; i < 100; i++) {
            map.put("heapsort", heapsort);
            map.put("mergesort", mergesort);
            map.put("quicksort", quicksort);
        }
    }

    @Test
    public void testHashMap() {
        Assert.assertArrayEquals(map.get("heapsort"), heapsort);
        Assert.assertArrayEquals(map.get("mergesort"), mergesort);
        Assert.assertArrayEquals(map.get("quicksort"), quicksort);
    }

    @Test
    public void testSize() {
        assertEquals(3, map.size());
    }

    @Test @Ignore
    public void testRemove() {
        map.delete("heapsort");
        assertEquals(null, map.get("heapsort"));
    }
}
