package recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialRecursion(5));
    }

    // Factorial with Recursion
    public static long factorialRecursion(int num) {
        if (num < 0) return -1;
        else if (num == 0 || num == 1) return 1;
        else {
            return num * factorialRecursion(num - 1);
        }
    }
}
