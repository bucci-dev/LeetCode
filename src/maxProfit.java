public class maxProfit {
    public int maxProfit(int[] prices) {
        int lowest = prices[0];
        int profit = 0;

        for (int x : prices){
            lowest = (x < lowest) ? x : lowest;
            profit = (x > lowest && x-lowest > profit) ? x-lowest : profit;
        }

        return profit;
    }
}
