package collections;

import java.util.*;

public class PickingNumbers {
  public static void main(String[] args) {
    List<Integer> integers = Arrays.asList(3, 2, 1, 1, 2, 3, 4);

    System.out.println("result = " + pickingNumbers(integers));
  }

  public static int pickingNumbers(List<Integer> listInteger) {
    Map<Integer, Integer> mapIntegers = new HashMap<>();

    for (int i = 0; i < listInteger.size(); i++) {
      int val = listInteger.get(i);
      if (mapIntegers.containsKey(val)) {
        mapIntegers.put(val, mapIntegers.get(val) + 1);
      } else {
        mapIntegers.put(val, 1);
      }
    }

    int result = 0;

    for (int i : mapIntegers.keySet()) {

      int left = (mapIntegers.containsKey(i - 1)) ? mapIntegers.get(i) + mapIntegers.get(i - 1)
          : mapIntegers.get(i);
      int right = (mapIntegers.containsKey(i + 1)) ? mapIntegers.get(i) + mapIntegers.get(i + 1)
          : mapIntegers.get(i);

      if (left > result)
        result = left;
      if (right > result)
        result = right;
    }


    return result;
  }
}
