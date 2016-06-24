//Given a matrix of m x n elements (m rows, n columns), 
//return all elements of the matrix in spiral order.
//For example,
//Given the following matrix:
//[
// [ 1, 2, 3 ],
// [ 4, 5, 6 ],
// [ 7, 8, 9 ]
//]
//You should return [1,2,3,6,9,8,7,4,5].
package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yingxinxie
 */
public class SpiralMatrix {

  public List<Integer> spiralOrder(int[][] matrix) {

    List<Integer> list = new ArrayList<Integer>();

    int rowsize = matrix.length;
    if (rowsize == 0) {
      return list;
    }
    int colsize = matrix[0].length;
    if (colsize == 0) {
      return list;
    }

    int rowStart = 0;
    int rowEnd = rowsize - 1;
    int colStart = 0;
    int colEnd = colsize - 1;

    while (rowStart <= rowEnd && colStart <= colEnd) {
      //right
      for (int i = colStart; i <= colEnd; i++) {
        list.add(matrix[rowStart][i]);
      }
      rowStart++;

      //down
      for (int i = rowStart; i <= rowEnd; i++) {
        list.add(matrix[i][colEnd]);
      }
      colEnd--;

      //left
      if (rowStart <= rowEnd) {
        for (int i = colEnd; i >= colStart; i--) {
          list.add(matrix[rowEnd][i]);
        }
      }
      rowEnd--;

      //up
      if (colStart <= colEnd) {
        for (int i = rowEnd; i >= rowStart; i--) {
          list.add(matrix[i][colStart]);
        }
      }
      colStart++;
    }

    return list;

  }
}
