//Given a collection of numbers, return all possible permutations.
//For example,
//[1,2,3] have the following permutations:
//[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yingxinxie
 */
public class Permutations {

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    int size = nums.length;
    permuteHelper(list, nums, 0, size);
    return list;
  }

  public void permuteHelper(List<List<Integer>> list, int[] nums, int begin, int size) {
    if (begin >= size) {
      List<Integer> l = new ArrayList<Integer>();
      for (int i = 0; i < size; i++) {
        l.add(nums[i]);
      }
      list.add(l);
    }
    for (int i = begin; i < size; i++) {
      int tmp = nums[i];
      nums[i] = nums[begin];
      nums[begin] = tmp;
      permuteHelper(list, nums, begin + 1, size);
      nums[begin] = nums[i];
      nums[i] = tmp;
    }
  }
}
