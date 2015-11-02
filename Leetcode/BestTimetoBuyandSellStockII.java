/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Say you have an array for which the ith element is the price of a given stock on day i.
//Design an algorithm to find the maximum profit. You may complete as many transactions as you like 
//(ie, buy one and sell one share of the stock multiple times). However, you may not engage 
//in multiple transactions at the same time (ie, you must sell the stock before you buy again).
package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class BestTimetoBuyandSellStockII {

  public int maxProfit(int[] prices) {
    int size = prices.length;
    if (size == 0 || size == 1) {
      return 0;
    }
    int result = 0;
    for (int i = 1; i < size; i++) {
      if (prices[i] > prices[i - 1]) {
        result = result + prices[i] - prices[i - 1];
      }
    }
    return result;
  }
}
