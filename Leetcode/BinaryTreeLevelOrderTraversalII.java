//Given a binary tree, return the bottom-up level order traversal of its nodes' values. 
//(ie, from left to right, level by level from leaf to root).
//Given binary tree {3,9,20,#,#,15,7},
//     3
//   9   20
//     15  7
//return:
//[
//  [15,7],
//  [9,20],
//  [3]
//]

package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author yingxinxie
 */
public class BinaryTreeLevelOrderTraversalII {

  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    if (root == null) {
      return list;
    }
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    q.add(root);
    int count1 = 0;
    int count2 = 0;
    int nodeNums = 1;
    TreeNode head = new TreeNode(0);
    while (q.peek() != null) {
      List<Integer> l = new ArrayList<Integer>();
      count1 = 0;
      count2 = nodeNums;
      nodeNums = 0;
      while (count1 < count2 && q.peek() != null) {
        head = q.peek();
        l.add(head.val);
        if (head.left != null) {
          q.add(head.left);
          nodeNums++;
        }
        if (head.right != null) {
          q.add(head.right);
          nodeNums++;
        }
        count1++;
        q.remove();
      }
      list.add(0, l);
    }
    return list;
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
