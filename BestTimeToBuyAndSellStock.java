// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        
        int max = 0;
        int min = prices[0];
        
        for (int i = 1; i < prices.length; i++) {
            if (min < prices[i]) {
                max = Math.max(max, prices[i] - min);
            } else {
                min = Math.min(min, prices[i]);
            }
        }
        return max;
    }
}
