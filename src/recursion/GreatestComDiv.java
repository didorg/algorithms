package recursion;

// Greatest Common Divisor
public class GreatestComDiv {
    public static void main(String[] args) {
        System.out.println(gcd(8, 12));
    }

    // Applying Euclidean Algorithm
    private static int gcd(int n, int m) {
        if(n<0 || m<0) return -1;
        if(m == 0) return n;
        return gcd(m, n%m);
    }
}
