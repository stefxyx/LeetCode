//Given an integer n, generate a square matrix filled with elements 
//from 1 to n^2 in spiral order.
//For example,
//Given n = 3,
//You should return the following matrix:
//[
// [ 1, 2, 3 ],
// [ 8, 9, 4 ],
// [ 7, 6, 5 ]
//]
package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class SpiralMatrixII {

  public int[][] generateMatrix(int n) {
    int[][] matrix = new int[n][n];
    if (n == 0) {
      return matrix;
    }
    int num = 1;
    int rowStart = 0;
    int rowEnd = n - 1;
    int colStart = 0;
    int colEnd = n - 1;

    while (rowStart <= rowEnd && colStart <= colEnd) {

      //right
      for (int i = colStart; i <= colEnd; i++) {
        matrix[rowStart][i] = num;
        num++;
      }
      rowStart++;

      //down
      for (int i = rowStart; i <= rowEnd; i++) {
        matrix[i][colEnd] = num;
        num++;
      }
      colEnd--;

      //left
      for (int i = colEnd; i >= colStart; i--) {
        matrix[rowEnd][i] = num;
        num++;
      }
      rowEnd--;

      //up
      for (int i = rowEnd; i >= rowStart; i--) {
        matrix[i][colStart] = num;
        num++;
      }
      colStart++;

    }

    return matrix;
  }
}
