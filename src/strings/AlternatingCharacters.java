package strings;

public class AlternatingCharacters {
  public static void main(String[] args) {
    String s = "AAABBB";
    System.out.println("minimum number of deletions required is: " + alternatingCharacters(s));
  }

  static int alternatingCharacters(String s) {
    int n = 0;
    for (int i = 0; i < s.length()-1; i++) {
      if(s.charAt(i)==s.charAt(i+1)){
        n++;
      }
    }
    return n;
  }

}
