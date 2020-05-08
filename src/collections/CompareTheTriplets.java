package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// O(1)
// Compare the Triplets | HackerRank (easy)
public class CompareTheTriplets {
  public static void main(String[] args) {

    List<Integer> alice = new ArrayList<>();
    Collections.addAll(alice, 17, 28, 30);
    List<Integer> bob = new ArrayList<>();
    Collections.addAll(bob, 99, 16, 8);

    List<Integer> pointResult = compareTriplets(alice, bob);
    System.out.println("pointResult = " + pointResult);
  }

  static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    Integer aPoints = ((a.get(0) > b.get(0) ? 1 : 0) + (a.get(1) > b.get(1) ? 1 : 0)
        + (a.get(2) > b.get(2) ? 1 : 0));
    Integer bPoints = ((b.get(0) > a.get(0) ? 1 : 0) + (b.get(1) > a.get(1) ? 1 : 0)
        + (b.get(2) > a.get(2) ? 1 : 0));

    List<Integer> result = new ArrayList<>();
    Collections.addAll(result, aPoints, bPoints);

    return result;
  }
}
