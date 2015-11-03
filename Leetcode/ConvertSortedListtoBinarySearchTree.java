//Given a singly linked list where elements are sorted in ascending order, 
//convert it to a height balanced BST.
package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class ConvertSortedListtoBinarySearchTree {

  private ListNode node;

  public TreeNode sortedListToBST(ListNode head) {
    if (head == null) {
      return null;
    }
    node = head;
    int size = 0;
    while (head != null) {
      size++;
      head = head.next;
    }
    return getBST(0, size - 1);
  }

  public TreeNode getBST(int index1, int index2) {
    // if(index1==index2) return new TreeNode(node.val);
    if (index1 > index2) {
      return null;
    }
    int mid = (index1 + index2) / 2;
    TreeNode left = getBST(index1, mid - 1);
    TreeNode root = new TreeNode(node.val);
    root.left = left;
    node = node.next;
    root.right = getBST(mid + 1, index2);
    return root;
  }

//  Definition for singly-linked list.
  public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
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
