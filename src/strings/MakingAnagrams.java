package strings;

public class MakingAnagrams {

  public static void main(String[] args) {
    String a = "showman";
    String b ="woman";
    //Expected: 2
    /*
    * fcrxzwscanmligyxyvym
    * jxwtrhvujlmrpdoqbisbwhmgpmeoke
    * Expected: 30
    * */
    System.out.println("makeAnagram result is: "+makeAnagram(a, b));
  }

  // Algorithm below
  /**
   *  97 is the ASCII code of character a. Since the string only consist of lower case letters, there's an array of size 26. 
   *  To store the count of letter a means subtract 97 from character and add one to it's array value
   **/
  static int makeAnagram(String a, String b) {
    int cArr[]=new int[26];
    for(int i=0;i<a.length();i++) cArr[a.charAt(i)-97]++;
    for(int i=0;i<b.length();i++) cArr[b.charAt(i)-97]--;
    int count=0;
    for(int i=0;i<26;i++) count+=Math.abs(cArr[i]);

    return count;
  }

}
