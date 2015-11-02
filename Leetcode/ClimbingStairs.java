/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class ClimbingStairs {

  // Map<Integer, Integer> map = new HashMap<Integer, Integer>();
  public int climbStairs(int n) {
    if (n == 0 || n == 1 || n == 2) {
      return n;
    }
    int[] result = new int[n];
    result[0] = 1;
    result[1] = 2;
    for (int i = 2; i < n; i++) {
      result[i] = result[i - 1] + result[i - 2];
    }
    return result[n - 1];
    // if(n==0) return 0;
    // if(n==1) return 1;
    // if(n==2) return 2;
    // if(!map.containsKey(n)) map.put(n,climbStairs(n-1)+climbStairs(n-2));
    // return map.get(n);
  }
}
