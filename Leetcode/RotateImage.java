//You are given an n x n 2D matrix representing an image.
//
//Rotate the image by 90 degrees (clockwise).
//
//Follow up:
//Could you do this in-place?
package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class RotateImage {

  public void rotate(int[][] matrix) {
    int size = matrix.length;
    if (size == 0) {
      return;
    }
    int start = 0;
    int end = size - 1;
    while (start <= end) {
      for (int i = start; i < end; i++) {
        int tmp = matrix[start][i];
        matrix[start][i] = matrix[end + start - i][start];
        matrix[end + start - i][start] = matrix[end][end + start - i];
        matrix[end][end + start - i] = matrix[i][end];
        matrix[i][end] = tmp;
      }
      start++;
      end--;
    }
  }
}
