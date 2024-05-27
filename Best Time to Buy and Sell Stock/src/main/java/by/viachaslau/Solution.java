package by.viachaslau;


public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(solution.maxProfit(prices));
        for (int price : prices
        ) {
            System.out.print(price + " ");
        }
    }

    public int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            int profit = price - min;
            if (profit > max) {
                max = profit;
            }
        }
        return max;
    }
}