//Related to question Excel Sheet Column Title
//Given a column title as appear in an Excel sheet, return its corresponding column number.
//For example:
//    A -> 1
//    B -> 2
//    C -> 3
//    ...
//    Z -> 26
//    AA -> 27
//    AB -> 28 
package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class ExcelSheetColumnNumber {

  public int titleToNumber(String s) {
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      result = result * 26 + c - 'A' + 1;
    }
    return result;
  }
}
