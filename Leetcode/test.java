/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class test {

  public static void main(String[] args) {
    TreeNode n1 = new TreeNode(1);
    TreeNode n2 = new TreeNode(2);
//    TreeNode n3 = new TreeNode(3);
//    TreeNode n4 = new TreeNode(4);
    n1.right = n2;
    
    KthSmallestElementinaBST testclass = new KthSmallestElementinaBST();
    int value = testclass.kthSmallest(n1, 2);

    System.out.println(value);
  }

}

class KthSmallestElementinaBST {

  private static int value = 0;
  private static int count = 0;

  public int kthSmallest(TreeNode root, int k) {
    kthSmallestHelper(root, k);
    return value;
  }

  public void kthSmallestHelper(TreeNode root, int k) {
    if (root == null) {
      return;
    }
    kthSmallestHelper(root.left, k);
    count++;
    if (count == k) {
      value = root.val;
      return;
    }
    kthSmallestHelper(root.right, k);
  }
}

class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
}
