package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(revToNewArr(arr)));
        revArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] revToNewArr(int[] arr) {
        int n = arr.length;
        int[] arrResult = new int[n];

        for (int i = n; i > 0; i--) {
            arrResult[n - i] = arr[i - 1];
        }
        return arrResult;
    }

    static void revArr(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int t = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = t;
        }
    }
}
