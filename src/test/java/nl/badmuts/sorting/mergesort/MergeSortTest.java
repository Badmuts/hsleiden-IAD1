package nl.badmuts.sorting.mergesort;

import junit.framework.TestCase;
import org.junit.Test;

public class MergeSortTest extends TestCase {

    @Test
    public void testMergeSort() {
        int[] unsorted = {5, 1, 0 ,4, 2};
        MergeSort.sort(unsorted);
    }

}
