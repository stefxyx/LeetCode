//Count the number of prime numbers less than a non-negative number, n.
package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yingxinxie
 */
public class CountPrimes {

  public int countPrimes(int n) {
    if (n <= 2) {
      return 0;
    }
    List<Integer> list = new ArrayList<Integer>();
    list.add(2);
    for (int i = 3; i < n; i = i + 2) {
      int j = 0;
      for (j = 0; j < list.size(); j++) {
        if (i % list.get(j) == 0) {
          break;
        }
        if (list.get(j) > Math.sqrt(i)) {
          break;
        }
      }
      if (list.get(j) > Math.sqrt(i)) {
        list.add(i);
      }
    }
    return list.size();
  }
}
