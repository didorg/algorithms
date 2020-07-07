package arrays;

import java.util.Arrays;

/** Return an array with the top four maximum value **/
public class TopFour {

  public static void main(String[] args) {
    int[] arr = {1232, -1221, 0, 345, 78, 99, 159};

    System.out.println(Arrays.toString(topFour(arr)));
  }

  public static int[] topFour(int[] arr){
    Arrays.sort(arr);

    int[] topFour = Arrays.copyOfRange(arr, arr.length-4, arr.length);
    /*** @return a new array containing the specified range from the original array */
    //int[] lowerFour = Arrays.copyOfRange(arr, 0,4);

    return topFour;
  }
}
