//Compare two version numbers version1 and version2.
//If version1 > version2 return 1, if version1 < version2 return -1, 
//otherwise return 0.
//You may assume that the version strings are non-empty 
//and contain only digits and the . character.
//The . character does not represent a decimal point and is used to 
//separate number sequences.
//For instance, 2.5 is not "two and a half" or "half way to version three", 
//it is the fifth second-level revision of the second first-level revision.
//0.1 < 1.1 < 1.2 < 13.37
package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class CompareVersionNumbers {

  public int compareVersion(String version1, String version2) {
    String[] s1 = version1.split("\\.");
    String[] s2 = version2.split("\\.");
    int len1 = s1.length;
    int len2 = s2.length;
    int len = Math.max(len1, len2);
    int i = 0;
    int num1 = 0;
    int num2 = 0;
    while (i < len) {
      if (i < len1) {
        num1 = Integer.parseInt(s1[i]);
      } else {
        num1 = 0;
      }
      if (i < len2) {
        num2 = Integer.parseInt(s2[i]);
      } else {
        num2 = 0;
      }
      if (num1 > num2) {
        return 1;
      } else if (num1 < num2) {
        return -1;
      } else {
        i++;
      }
    }
    return 0;
  }
}
