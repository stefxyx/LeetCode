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
public class addDigits {

  public int addDigits(int num) {
    if (num == 0) {
      return 0;
    } else if (num % 9 == 0) {
      return 9;
    } else {
      return num % 9;
    }
    // int sum = 0;
    // while(num >= 10){
    //     while(num > 0){
    //         sum += num % 10;
    //         num /= 10;
    //     }
    //     num = sum;
    //     sum = 0;
    // }
    // return num;
  }
}
