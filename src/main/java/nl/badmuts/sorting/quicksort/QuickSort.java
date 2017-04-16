package nl.badmuts.sorting.quicksort;

/**
 * Created by Daanr on 15-Apr-17.
 */
public class QuickSort {
    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        quicksort(arr, 0, arr.length - 1);
    }

    private static void quicksort(int[] arr, int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list.
        int pivot = arr[low + (high-low)/2];

        while (i <= j) {
            // If the current value from the left list is smaller then the pivot
            // element then get the next element from the left list
            while (arr[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
            while (arr[j] > pivot) {
                j--;
            }

            // If we have found a values in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(arr, i, j);
                i++;
                j--;
            }
        }

        // Recursion
        if (low < j)
            quicksort(arr, low, j);
        if (i < high)
            quicksort(arr, i, high);
    }

    private static void exchange(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
