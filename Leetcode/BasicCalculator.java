//Implement a basic calculator to evaluate a simple expression string.
//The expression string may contain open ( and closing parentheses ), 
//the plus + or minus sign -, non-negative integers and empty spaces .
//You may assume that the given expression is always valid.
//"1 + 1" = 2
//" 2-1 + 2 " = 3
//"(1+(4+5+2)-3)+(6+8)" = 23
package Leetcode;

import java.util.Stack;

/**
 *
 * @author yingxinxie
 */
public class BasicCalculator {

  private Stack<Character> stack = new Stack<Character>();

  public int calculate(String s) {
    s = s.replaceAll(" ", "");
    int size = s.length();
    char c;
    for (int i = 0; i < size; i++) {
      c = s.charAt(i);
      if (c != ')') {
        stack.push(c);
      } else {
        int subTotal = getSubTotal();
        pushSubTotal(subTotal);
      }
    }
    return getSubTotal();
  }

  public int getSubTotal() {
    int subTotal = 0;
    while (!stack.empty() && stack.peek() != '(') {
      subTotal += getNum();
    }
    if (!stack.empty() && stack.peek() == '(') {
      stack.pop();
    }
    return subTotal;
  }

  public void pushSubTotal(int subTotal) {
    if (subTotal < 0) {
      if (!stack.empty() && stack.peek() == '+') {
        stack.pop();
      } else if (!stack.empty() && stack.peek() == '-') {
        stack.pop();
        stack.push('+');
        subTotal *= -1;
      }
    }
    String s = Integer.toString(subTotal);
    int size = s.length();
    for (int i = 0; i < size; i++) {
      stack.push(s.charAt(i));
    }
  }

  public int getNum() {
    StringBuilder sb = new StringBuilder();
    while (!stack.empty() && stack.peek() != '+' && stack.peek() != '-' && stack.peek() != '(') {
      char c = stack.pop();
      sb.insert(0, c);
    }
    int num = (int) Integer.parseInt(sb.toString());
    if (!stack.empty() && stack.peek() == '-') {
      num *= -1;
      stack.pop();
    } else if (!stack.empty() && stack.peek() == '+') {
      stack.pop();
    }
    return num;
  }
}
