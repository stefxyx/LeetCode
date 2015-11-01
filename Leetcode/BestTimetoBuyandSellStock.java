/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Say you have an array for which the ith element is the price of a given stock on day i.
//If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
//design an algorithm to find the maximum profit.
package Leetcode;

/**
 *
 * @author yingxinxie
 */
public class BestTimetoBuyandSellStock {

  public int maxProfit(int[] prices) {
    int size = prices.length;
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int i = 0; i < size; i++) {
      minPrice = Math.min(prices[i], minPrice);
      maxProfit = Math.max(prices[i] - minPrice, maxProfit);
    }
    return maxProfit;
  }
}
