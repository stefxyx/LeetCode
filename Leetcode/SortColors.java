//Given an array with n objects colored red, white or blue, sort them 
//so that objects of the same color are adjacent, with the colors 
//in the order red, white and blue.
//Here, we will use the integers 0, 1, and 2 to represent the color 
//red, white, and blue respectively.
package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class SortColors {

  public void sortColors(int[] nums) {
    int size = nums.length;
    if (size == 0 || size == 1) {
      return;
    }
    int point1 = 0;
    int point2 = size - 1;
    int i = 0;
    while (i <= point2) {
      if (nums[i] == 0) {
        nums[i] = nums[point1];
        nums[point1] = 0;
        point1++;
        i++;
        //there should be sorted zeros and ones before i
      } else if (nums[i] == 2) {
        nums[i] = nums[point2];
        nums[point2] = 2;
        point2--;//there should not be any 2 before i
      } else {
        i++;
      }
    }
  }
}
