package arrays;

import java.util.Arrays;

public class LeftRotation {
  public static void main(String[] args) {
    //int n = 20;
    int d = 10;
    int[] a = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
    // Expected: 77 97 58 1 86 58 26 10 86 51 41 73 89 7 10 1 59 58 84 77
    
    System.out.println(
        "The array after performing " + d + " left rotations is " + Arrays.toString(rotLeft(a, d)));
  }

  static int[] rotLeft(int[] a, int d) {
    int result[] = new int[a.length];
    for (int i = a.length - 1; i >= 0; i--) {
      if (i - d < 0) {
        result[a.length - (-1 * (i - d))] = a[i];
      } else
        result[i - d] = a[i];
    }

    return result;
  }
}
