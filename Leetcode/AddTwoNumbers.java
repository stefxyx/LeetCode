//You are given two linked lists representing two non-negative numbers. 
//The digits are stored in reverse order and each of their nodes contain a single digit. 
//Add the two numbers and return it as a linked list.
//
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8

package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class AddTwoNumbers {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null) {
      return null;
    }
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    ListNode node = new ListNode(0);
    ListNode l3 = node;
    int digit = 0;
    int sum = 0;
    while (l1 != null || l2 != null) {
      if (l1 == null) {
        sum = l2.val + digit;
        l2 = l2.next;
      } else if (l2 == null) {
        sum = l1.val + digit;
        l1 = l1.next;
      } else {
        sum = l1.val + l2.val + digit;
        l1 = l1.next;
        l2 = l2.next;
      }
      l3.next = new ListNode(sum % 10);
      digit = sum / 10;
      l3 = l3.next;
    }
    if (digit == 1) {
      l3.next = new ListNode(1);
    }
    return node.next;
  }

  public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
