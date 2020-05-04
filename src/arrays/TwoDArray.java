package arrays;


public class TwoDArray {
  
  public static void main(String[] args) {
    /**
     * 1 1 1 0 0 0 0 1 0 0 0 0 1 1 1 0 0 0 0 0 2 4 4 0 0 0 0 2 0 0 0 0 1 2 4 0
     **/
    int arrayTwoD[][] = new int[6][6];
    arrayTwoD[0][0] = 1;
    arrayTwoD[0][1] = 1;
    arrayTwoD[0][2] = 1;
    arrayTwoD[0][3] = 0;
    arrayTwoD[0][4] = 0;
    arrayTwoD[0][5] = 0;
    arrayTwoD[1][0] = 0;
    arrayTwoD[1][1] = 1;
    arrayTwoD[1][2] = 0;
    arrayTwoD[1][3] = 0;
    arrayTwoD[1][4] = 0;
    arrayTwoD[1][5] = 0;
    arrayTwoD[2][0] = 1;
    arrayTwoD[2][1] = 1;
    arrayTwoD[2][2] = 1;
    arrayTwoD[2][3] = 0;
    arrayTwoD[2][4] = 0;
    arrayTwoD[2][5] = 0;
    arrayTwoD[3][0] = 0;
    arrayTwoD[3][1] = 0;
    arrayTwoD[3][2] = 2;
    arrayTwoD[3][3] = 4;
    arrayTwoD[3][4] = 4;
    arrayTwoD[3][5] = 0;
    arrayTwoD[4][0] = 0;
    arrayTwoD[4][1] = 0;
    arrayTwoD[4][2] = 0;
    arrayTwoD[4][3] = 2;
    arrayTwoD[4][4] = 0;
    arrayTwoD[4][5] = 0;
    arrayTwoD[5][0] = 0;
    arrayTwoD[5][1] = 0;
    arrayTwoD[5][2] = 1;
    arrayTwoD[5][3] = 2;
    arrayTwoD[5][4] = 4;
    arrayTwoD[5][5] = 0;

    System.out.println("The largest (maximum) hourglass sum found is " + hourglassSum(arrayTwoD));

  }

  /** This is the Algorithm **/  
  static int hourglassSum(int[][] arr) {
    int maximum = Integer.MIN_VALUE;
    int sum = 0;

    for (int i = 0; i <= arr.length / 2; i++) {
      for (int j = 0; j <= arr.length / 2; j++) {
        sum += arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
        sum += arr[i + 1][j + 1];
        sum += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
        if (sum > maximum)
          maximum = sum;
        sum = 0;
      }
    }

    return maximum;
  }
  /** End Algorithm **/
}
