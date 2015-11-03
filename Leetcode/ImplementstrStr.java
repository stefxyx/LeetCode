//Implement strStr().
//Returns the index of the first occurrence of needle in haystack, 
//or -1 if needle is not part of haystack.
package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class ImplementstrStr {

  public int strStr(String haystack, String needle) {
    if (needle.length() == 0) {
      return 0;
    } else if (haystack.length() == 0) {
      return -1;
    }
    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
      for (int j = 0; j < needle.length(); j++) {
        if (haystack.charAt(i + j) != needle.charAt(j)) {
          break;
        } else if (j == needle.length() - 1) {
          return i;
        }
      }
    }
    return -1;
  }
}
