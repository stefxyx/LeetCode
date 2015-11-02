//Given n pairs of parentheses, write a function to generate all 
//combinations of well-formed parentheses.
//For example, given n = 3, a solution set is:
//"((()))", "(()())", "(())()", "()(())", "()()()"
package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yingxinxie
 */
public class GenerateParentheses {

  public List<String> generateParenthesis(int n) {
    List<String> list = new ArrayList<String>();
    parenthesisHelper(list, "", 0, 0, n);
    return list;
  }

  public void parenthesisHelper(List<String> list, String s, int left, int right, int n) {
    if (s.length() == n * 2) {
      list.add(s);
      return;
    }
    if (left < n) {
      parenthesisHelper(list, s + "(", left + 1, right, n);
    }
    if (right < left) {
      parenthesisHelper(list, s + ")", left, right + 1, n);
    }
  }
}
