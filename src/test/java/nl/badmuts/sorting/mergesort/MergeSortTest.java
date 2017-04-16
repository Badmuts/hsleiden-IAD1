package nl.badmuts.sorting.mergesort;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest extends TestCase {
    public MergeSort ms;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        ms = new MergeSort();
    }

    @Test
    public void testMergeSort() {
        int[] unsorted = {5, 1, 0 ,4, 2};
        int[] expected = {0, 1, 2, 4, 5};
        ms.sort(unsorted);
        Assert.assertArrayEquals(expected, unsorted);
    }

    @Test
    public void testNegatives() {
        int[] unsorted = new int[]{-9, -1, -8, -5};
        int[] expected = new int[]{-9, -8, -5, -1};
        ms.sort(unsorted);
        Assert.assertArrayEquals(expected, unsorted);
    }

}
