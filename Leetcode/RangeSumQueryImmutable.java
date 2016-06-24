//Given an integer array nums, 
//find the sum of the elements between indices i and j (i ≤ j), inclusive.
//
//Example:
//Given nums = [-2, 0, 3, -5, 2, -1]
//
//sumRange(0, 2) -> 1
//sumRange(2, 5) -> -1
//sumRange(0, 5) -> -3
//Note:
//You may assume that the array does not change.
//There are many calls to sumRange function.
package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class RangeSumQueryImmutable {

  int[] nums;

  public RangeSumQueryImmutable(int[] nums) {
    int size = nums.length;
    for (int i = 1; i < size; i++) {
      nums[i] = nums[i] + nums[i - 1];
    }
    this.nums = nums;
  }

  public int sumRange(int i, int j) {
    if (i == 0) {
      return nums[j];
    } else {
      return nums[j] - nums[i - 1];
    }
  }
}

// Your NumArray object will be instantiated and called as such:
// RangeSumQueryImmutable numArray = new RangeSumQueryImmutable(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);
