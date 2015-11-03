//The count-and-say sequence is the sequence of integers beginning as follows:
//1, 11, 21, 1211, 111221, ...
//1 is read off as "one 1" or 11.
//11 is read off as "two 1s" or 21.
//21 is read off as "one 2, then one 1" or 1211.
//Given an integer n, generate the nth sequence.
package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class CountandSay {

  public String countAndSay(int n) {
    if (n == 1) {
      return "1";
    }
    String s = countAndSay(n - 1);
    StringBuffer sb = new StringBuffer();
    int i = 0;
    while (i < s.length()) {
      int count = 1;
      while (i != s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
        count++;
        i++;
      }
      sb.append(count);
      sb.append(s.charAt(i));
      i++;
    }
    return sb.toString();
  }
}
