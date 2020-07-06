package sort;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

/**
 * It’s important to remember that Quicksort isn’t a stable algorithms
 **/
public class QuickSort {

  private static int len;

  public static void sort(int[] nums) {
    if (nums == null || nums.length == 0) {
      return;
    }
    len = nums.length;
    quickSort(nums, 0, len - 1);
  }

  private static void quickSort(int arr[], int begin, int end) {
    if (begin < end) {
      int partitionIndex = partition(arr, begin, end);

      quickSort(arr, begin, partitionIndex - 1);
      quickSort(arr, partitionIndex + 1, end);
    }
  }

  private static int partition(int arr[], int begin, int end) {
    int pivot = arr[end];
    int i = (begin - 1);

    for (int j = begin; j < end; j++) {
      if (arr[j] <= pivot) {
        i++;

        int swapTemp = arr[i];
        arr[i] = arr[j];
        arr[j] = swapTemp;
      }
    }

    int swapTemp = arr[i + 1];
    arr[i + 1] = arr[end];
    arr[end] = swapTemp;

    return i + 1;
  }

  @Test
  public void quickSortTest() {
    int[] array = {2, 1, 4, 6, 3, 5};
    int[] sortedArray = {1, 2, 3, 4, 5, 6};
    sort(array);
    assertArrayEquals(array, sortedArray);
  }

  public static void main(String[] args) {
    int[] arr = {5, 9, 4, 6, 5, 3};
    sort(arr);
    System.out.println("arr = " + Arrays.toString(arr));
  }

}
