class Solution {
	
	    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowestBuyPrice = Integer.MAX_VALUE;  
        for (int buyDay = 0 ; buyDay < prices.length; buyDay++)
        {
            if(prices[buyDay] < lowestBuyPrice){
                lowestBuyPrice = prices[buyDay];
            }
            else if(prices[buyDay] - lowestBuyPrice > maxProfit){
                    maxProfit = prices[buyDay] - lowestBuyPrice;
            }

        }
        return maxProfit;
    }
	
	
	
	N SQUARED SOLUTION BELOW
	
    // public int maxProfit(int[] prices) {
        // int maxProfit = 0;
        // for (int day = 0 ; day < prices.length; day++)
        // {
            // int buyPrice = prices[day];

            // for(int saleDate = day+1; saleDate < prices.length; saleDate++)
            // {
                    // int sellPrice  =  prices[saleDate];
                    // int profit = sellPrice - buyPrice;
                    // if (profit > maxProfit){
                        // maxProfit = profit;
                    // }
            // }
        // }
        // return maxProfit;
    // }
}