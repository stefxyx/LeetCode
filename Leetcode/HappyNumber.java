//Write an algorithm to determine if a number is "happy".
//A happy number is a number defined by the following process: 
//Starting with any positive integer, 
//replace the number by the sum of the squares of its digits, 
//and repeat the process until the number equals 1 (where it will stay), 
//or it loops endlessly in a cycle which does not include 1. 
//Those numbers for which this process ends in 1 are happy numbers.
//Example: 19 is a happy number
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1
package Leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author yingxinxie
 */
public class HappyNumber {

  public boolean isHappy(int n) {
    if (n == 0) {
      return false;
    }
    Set<Integer> set = new HashSet<Integer>();
    while (n != 0) {
      if (getSum(n) == 1) {
        return true;
      } else if (set.contains(getSum(n))) {
        return false;
      } else {
        set.add(getSum(n));
        n = getSum(n);
      }
    }
    return false;
  }

  public int getSum(int n) {
    int sum = 0;
    while (n > 0) {
      sum = sum + (n % 10) * (n % 10);
      n = n / 10;
    }
    return sum;
  }
}
