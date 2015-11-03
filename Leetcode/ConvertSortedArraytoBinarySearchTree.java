//Given an array where elements are sorted in ascending order, 
//convert it to a height balanced BST.
package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class ConvertSortedArraytoBinarySearchTree {

  public TreeNode sortedArrayToBST(int[] nums) {
    if (nums.length == 0 || nums == null) {
      return null;
    }
    return getBST(nums, 0, nums.length - 1);
  }

  public TreeNode getBST(int[] nums, int index1, int index2) {
    int size = index2 - index1;
    if (size == 0) {
      TreeNode root = new TreeNode(nums[index1]);
      return root;
    }
    if (size == 1) {
      TreeNode root = new TreeNode(nums[index1]);
      TreeNode right = new TreeNode(nums[index2]);
      root.right = right;
      return root;
    }
    int mid = (index1 + index2) / 2;
    TreeNode root = new TreeNode(nums[mid]);
    root.left = getBST(nums, index1, mid - 1);
    root.right = getBST(nums, mid + 1, index2);
    return root;
  }

//  Definition for a binary tree node.
  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}
