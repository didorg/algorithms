package strings;

public class CountingValleys {
  public static void main(String[] args) {
    int n = 8;
    String path = "UDDDUDUU";
    System.out.println("Number of valleys = " + countingValleys(n, path));
  }

  public static int countingValleys(int n, String s) {
    int sLevel = 0;
    int valley = 0;
    char u = 'U';
    char d = 'D';

    for (int i = 0; i < s.length(); i++) {
      if (u == s.charAt(i))
        ++sLevel;
      if (d == s.charAt(i))
        --sLevel;
      if (u == s.charAt(i) && sLevel == 0) {
        ++valley;
      }
    }

    return valley;
  }
}
