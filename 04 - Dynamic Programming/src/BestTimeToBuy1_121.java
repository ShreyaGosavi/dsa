public class BestTimeToBuy1_121 {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int[] dp = new int[n];

        dp[n - 1] = prices[n - 1];

        // Build max future price array
        for (int i = n - 2; i >= 0; i--) {
            dp[i] = Math.max(prices[i], dp[i + 1]);
        }

        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            int profit = dp[i] - prices[i];
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }

    public int maxProfit1(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            minPrice = Math.min(minPrice, price);

            int profit = price - minPrice;

            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
