//Given an integer n, return the number of trailing zeroes in n!.
//Note: Your solution should be in logarithmic time complexity.
package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class FactorialTrailingZeroes {

  public int trailingZeroes(int n) {
    int count = 0;
    while (n != 0) {
      n = n / 5;
      count = count + n;
    }
    return count;
  }
}
