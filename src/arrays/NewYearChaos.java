package arrays;

public class NewYearChaos {
  public static void main(String[] args) {
    /**
     *****************
     * 8 5 1 2 3 7 8 6 4 //Test 1 -> Too chaotic 8 1 2 5 3 7 8 6 4 //Test 2 -> 7
     *****************
     **/
    int[] q = {1, 2, 5, 3, 7, 8, 6, 4};
    minimumBribes(q);
  }

  static void minimumBribes(int[] q) {
    int bribes = 0;
    for (int i = q.length - 1; i > 0; i--) {
      if (q[i - 1] == i + 1) {
        q[i - 1] = q[i];
        bribes++;
      } else if (i >= 2 && q[i - 2] == i + 1) {
        q[i - 2] = q[i - 1];
        q[i - 1] = q[i];
        bribes += 2;
      } else if (q[i] != i + 1) {
        System.out.println("Too chaotic");
        return;
      }
    }
    System.out.println(bribes);
  }
}
