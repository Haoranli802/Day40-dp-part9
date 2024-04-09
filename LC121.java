class Solution {
    public int maxProfit(int[] prices) {
        int[] dp = new int[2];
        dp[0] = -prices[0];
        dp[1] = 0;
        for(int i = 1; i < prices.length; i++){
            dp[0] = Math.max(dp[0], -prices[i]);
            dp[1] = Math.max(dp[1], prices[i] + dp[0]);
        }
        return dp[1];
    }
}

/**
目标就是找到最小值的股票然后后后面大的股票减去此最小值股票。
O(N), O(1)
 */
