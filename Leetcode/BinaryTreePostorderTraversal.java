//Given a binary tree, return the postorder traversal of its nodes' values.
//Given binary tree {1,#,2,3},
//    1
//     \
//      2
//     /
//    3
//return [3,2,1].
package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author yingxinxie
 */
public class BinaryTreePostorderTraversal {

  // List<Integer> list = new ArrayList<Integer>();
  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();
    while (root != null || !stack.empty()) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }
      root = stack.peek();
      if (root.right == null) {
        list.add(root.val);
        stack.pop();
        root = null;
      } else {
        TreeNode tmp = root;
        root = root.right;
        tmp.right = null;
      }
    }

    return list;
    // if(root==null) return list;
    // postorderTraversal(root.left);
    // postorderTraversal(root.right);
    // list.add(root.val);
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
