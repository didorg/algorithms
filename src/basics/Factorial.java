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
    // 1
    public static long factorialForLoopOne(int num) {
        if (num < 0) return -1;
        if (num == 0 || num == 1) return 1;
        for (int i = num - 1; i >= 1; i--) {
            num *= i;
        }
        return num;
    }

    // Factorial with a FOR loop
    // 2
    public static long factorialForLoopTwo(int num) {
        if (num < 0) return -1;
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }


    @Test
    public void factorialRecursionTest() {
        //long expected = (-5)-1; (0)1; (1)1; (5)120;
        int num = 10;
        long expected = 3628800;

        long result1 = factorialRecursion(num);
        long result2 = factorialForLoopOne(num);
        long result3 = factorialForLoopTwo(num);

        Assertions.assertEquals(expected, result1);
        Assertions.assertEquals(expected, result2);
        Assertions.assertEquals(expected, result3);
    }

}
