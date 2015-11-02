//Given a binary tree, return the preorder traversal of its nodes' values.
//Given binary tree {1,#,2,3},
//    1
//     \
//      2
//     /
//    3
//return [1,2,3].
package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author yingxinxie
 */
public class BinaryTreePreorderTraversal {

// List<Integer> list = new ArrayList<Integer>();
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();
    while (root != null || !stack.empty()) {
      while (root != null) {
        list.add(root.val);
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();
      root = root.right;
    }
    return list;

    // if(root==null) return list;
    // list.add(root.val);
    // preorderTraversal(root.left);
    // preorderTraversal(root.right);
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
