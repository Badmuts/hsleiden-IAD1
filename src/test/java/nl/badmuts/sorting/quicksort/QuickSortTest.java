package nl.badmuts.sorting.quicksort;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Daanr on 15-Apr-17.
 */
public class QuickSortTest extends TestCase {

    @Test
    public void testQuickSort() {
        int[] unsorted = {4, 1, 9, 5, 7, 10};
        int[] expected = {1, 4, 5, 7, 9, 10};
        QuickSort.sort(unsorted);
        Assert.assertArrayEquals(expected, unsorted);
    }

    @Test
    public void testQuickSort2() {
        int[] unsorted = new int[]{9, 1, 8, 5};
        int[] expected = new int[]{1, 5, 8, 9};
        QuickSort.sort(unsorted);
        Assert.assertArrayEquals(expected, unsorted);
    }
}
