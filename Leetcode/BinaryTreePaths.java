//Given a binary tree, return all root-to-leaf paths.
//given
//    1
//  2   3
//   5
//return: ["1->2->5", "1->3"]
package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yingxinxie
 */
public class BinaryTreePaths {

  public List<String> binaryTreePaths(TreeNode root) {
    List<String> list = new ArrayList<String>();
    if (root != null) {
      binaryTreePathsHelper(root, "", list);
    }
    return list;
  }

  public void binaryTreePathsHelper(TreeNode root, String path, List<String> list) {
    if (root.left == null && root.right == null) {
      list.add(path + root.val);
    }
    if (root.left != null) {
      binaryTreePathsHelper(root.left, path + root.val + "->", list);
    }
    if (root.right != null) {
      binaryTreePathsHelper(root.right, path + root.val + "->", list);
    }
  }

  //Definition for a binary tree node.
  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}
