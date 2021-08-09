package basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Factorial {

    // Factorial with Recursion
    public static long factorialRecursion(int num) {
        if (num < 0) return -1;
        else if (num == 0 || num == 1) return 1;
        else {
            return num * factorialRecursion(num - 1);
        }
    }

    // Factorial with a FOR loop
    public static long factorialForLoopOne(int num) {
        if (num < 0) return -1;
        if (num == 0 || num == 1) return 1;
        for (int i = num - 1; i >= 1; i--) {
            num *= i;
        }
        return num;
    }

    public static long factorialForLoopTwo(int num) {
        if (num < 0) return -1;
        if (num == 0 || num == 1) return 1;
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }


    @Test
    public void factorialRecursionTest() {
        int num = 10;
        long expected = 3628800;
        long result = factorialRecursion(num);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void factorialForLoopOneTest() {
        int num = 10;
        long expected = 3628800;
        long result = factorialForLoopOne(num);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void factorialForLoopTwoTest() {
        int num = 10;
        long expected = 3628800;
        long result = factorialForLoopTwo(num);
        Assertions.assertEquals(expected, result);
    }
}
