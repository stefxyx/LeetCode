//Given a binary tree, determine if it is height-balanced.
//
//For this problem, a height-balanced binary tree is defined 
//as a binary tree in which the depth of the two subtrees of every node 
//never differ by more than 1.
package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class BalancedBinaryTree {

  public boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    } else if (isBalanced(root.left) && isBalanced(root.right)
            && (getDegree(root.left) - getDegree(root.right) == 0
            || getDegree(root.left) - getDegree(root.right) == 1
            || getDegree(root.left) - getDegree(root.right) == -1)) {
      return true;
    } else {
      return false;
    }
  }

  public int getDegree(TreeNode root) {
    if (root == null) {
      return 0;
    }
    if (root.left == null && root.right == null) {
      return 1;
    }
    return Math.max(getDegree(root.left), getDegree(root.right)) + 1;
  }

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

}
