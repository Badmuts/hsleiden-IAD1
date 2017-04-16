package nl.badmuts.sorting.heapsort;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Daanr on 16-Apr-17.
 */
public class HeapSortTest extends TestCase {
    HeapSort hs;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        hs = new HeapSort();
    }

    @Test
    public void testSort() throws Exception {
        int[] unsorted = {4, 1, 9, 5, 7, 10};
        int[] expected = {1, 4, 5, 7, 9, 10};
        hs.sort(unsorted);
        Assert.assertArrayEquals(expected, unsorted);
    }

    public void testNegatives() throws Exception {
        int[] unsorted = new int[]{-9, -1, -8, -5};
        int[] expected = new int[]{-9, -8, -5, -1};
        hs.sort(unsorted);
        Assert.assertArrayEquals(expected, unsorted);
    }
}
