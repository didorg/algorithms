package recursion;

// How to calculate power of number using recursion?
public class PowerOfNum {
    public static void main(String[] args) {
        System.out.println(powerOfNum(2, 2));
    }

    private static int powerOfNum(int n, int exp) {
        if(exp < 0) return -1;
        if(exp == 0 ) return 1;
        return n * powerOfNum(n, exp-1);
    }
}
