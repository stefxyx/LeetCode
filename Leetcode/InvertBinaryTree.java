//Invert a binary tree.
//
//     4
//   /   \
//  2     7
// / \   / \
//1   3 6   9
//to
//     4
//   /   \
//  7     2
// / \   / \
//9   6 3   1
package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class InvertBinaryTree {

  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return null;
    } else {
      TreeNode result = new TreeNode(root.val);
      result.left = invertTree(root.right);
      result.right = invertTree(root.left);
      return result;
    }
  }
  
// Definition for a binary tree node.

  class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}
