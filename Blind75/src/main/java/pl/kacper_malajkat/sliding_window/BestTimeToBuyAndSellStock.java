package pl.kacper_malajkat.sliding_window;

/*
    You are given an array prices where prices[i]
    is the price of a given stock on the ith day.

    You want to maximize your profit by choosing
    a single day to buy one stock and choosing
    a different day in the future to sell that stock.

    Return the maximum profit you can achieve from this transaction.
    If you cannot achieve any profit, return 0.

    T: O(N)
    S: O(1)
*/
class BestTimeToBuyAndSellStock {

    static int solution(int[] prices) {
        int buy = 0, sell = 1, maxP = 0;

        while (sell < prices.length) {
            if (prices[buy] < prices[sell]) {
                int profit = prices[sell] - prices[buy];
                maxP = Math.max(maxP, profit);
            } else buy = sell;

            sell++;
        }
        return maxP;
    }

}
