class Solution {
    public int maxProfit(int[] prices) {
        int[] dp = new int[2];
        dp[0] = - prices[0];
        dp[1] = 0;
        for(int i = 1; i< prices.length; i++){
            dp[0] = Math.max(dp[0], dp[1] - prices[i]);
            dp[1] = Math.max(dp[1], dp[0] + prices[i]);
        }
        return dp[1];
    }
}

/**
持续性的找到可以盈利的股票，然后累计卖出即可。
O(N), O(1)
 */
