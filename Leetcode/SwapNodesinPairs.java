//Given a linked list, swap every two adjacent nodes and return its head.
//For example,
//Given 1->2->3->4, you should return the list as 2->1->4->3.
//Your algorithm should use only constant space. You may not modify the values 
//in the list, only nodes itself can be changed.
package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class SwapNodesinPairs {

  public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode newhead = new ListNode(0);
    newhead.next = head;
    ListNode i = newhead;
    while (head != null && head.next != null) {
      i.next = head.next;
      head.next = i.next.next;
      i.next.next = head;
      i = head;
      head = head.next;
    }
    return newhead.next;
  }

//  Definition for singly-linked list.
  public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
