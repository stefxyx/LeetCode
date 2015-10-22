//Given two binary strings, return their sum (also a binary string).
//
//For example,
//a = "11"
//b = "1"
//Return "100".

package Leetcode;

/**
 *
 * @author yingxinxie
 */

public class AddBinary {

  public String addBinary(String a, String b) {
    if (a.equals("0")) {
      return b;
    }
    if (b.equals("0")) {
      return a;
    }
    if (a.length() < b.length()) {
      String tmp = b;
      b = a;
      a = tmp;
    }
    char[] arr = new char[a.length()];
    char adding = '0';
    for (int i = a.length() - 1, j = b.length() - 1; j >= 0; i--, j--) {
      if (a.charAt(i) == '1' && b.charAt(j) == '1') {
        arr[i] = adding;
        adding = '1';
      } else if (a.charAt(i) == '0' && b.charAt(j) == '0') {
        arr[i] = adding;
        adding = '0';
      } else if (adding == '1') {
        arr[i] = '0';
        adding = '1';//removed
      } else {
        arr[i] = '1';
        adding = '0';//removed
      }
    }
    for (int i = a.length() - b.length() - 1; i >= 0; i--) {
      if (a.charAt(i) == '0') {
        arr[i] = adding;
        adding = '0';
      } else if (adding == '1') {
        arr[i] = '0';
      } else {
        arr[i] = '1';
      }
    }
    StringBuffer sb = new StringBuffer();
    if (adding == '1') {
      sb.append('1');
      sb.append(arr);
    } else {
      sb.append(arr);
    }
    return sb.toString();
  }
}
