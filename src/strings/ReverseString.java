package strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseString {

    // Reverse with StringBuilder (recommended)
    private static String reverseWithStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    //Reverse Manual
    private static String reverseManual(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    @Test
    public void reverseManualTest() {
        String str = "hello";
        String strExpected = "olleh";
        String strResult = reverseManual(str);
        Assertions.assertEquals(strExpected, strResult);
    }

/*	public static void main(String[] args) {
		String str = "Hello World!";

		System.out.println(reverseWithStringBuilder(str));
		System.out.println(reverseManual(str));
	}*/

}