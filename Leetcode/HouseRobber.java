//You are a professional robber planning to rob houses along a street. 
//Each house has a certain amount of money stashed, 
//the only constraint stopping you from robbing each of them is that 
//adjacent houses have security system connected 
//and it will automatically contact the police 
//if two adjacent houses were broken into on the same night.
//Given a list of non-negative integers 
//representing the amount of money of each house, 
//determine the maximum amount of money you can rob tonight 
//without alerting the police.
package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author yingxinxie
 */
public class HouseRobber {

  Map<Integer, Integer> map = new HashMap<Integer, Integer>();

  public int rob(int[] nums) {
    return robSum(nums, 0);
  }

  public int robSum(int[] nums, int index) {
    if (nums.length == 0) {
      return 0;
    }
    if (index == nums.length - 1) {
      return nums[nums.length - 1];
    }
    if (index == nums.length - 2) {
      return Math.max(nums[nums.length - 1], nums[nums.length - 2]);
    }
    if (map.containsKey(index)) {
      return map.get(index);
    } else {
      map.put(index, Math.max(nums[index] + robSum(nums, index + 2), robSum(nums, index + 1)));
    }
    return map.get(index);
  }
}
