package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }

    // Fibonacci
    public static long fibonacci(int n) {
        if (n < 0) return -1;
        else if (n == 0 || n == 1) return n;
        else {
            return fibonacci(n -1 ) + fibonacci(n - 2);
        }
    }
}
