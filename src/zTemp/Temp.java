package zTemp;

public class Temp {
    public static void main(String[] args) {
        System.out.println(numPower(2, 4));
    }

    private static int numPower(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }
}
