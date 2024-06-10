package org.example;


class Solution {

    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1])
                profit += prices[i + 1] - prices[i];
        }
        return profit;
    }
}