//Given a binary tree, return the inorder traversal of its nodes' values.
//Given binary tree {1,#,2,3},
//  1
//   \
//    2
//    /
//   3
//return [1,3,2]
package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author yingxinxie
 */
public class BinaryTreeInorderTraversal {

  // List<Integer> list = new ArrayList<Integer>();
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();
    while (root != null || !stack.empty()) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();
      list.add(root.val);
      root = root.right;
    }
    return list;

    // if(root==null) return list;
    // inorderTraversal(root.left);
    // list.add(root.val);
    // inorderTraversal(root.right);
    // return list;
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
