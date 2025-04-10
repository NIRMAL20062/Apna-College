public class StockProfitOneTransaction {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockPrices = {7, 1, 5, 3, 6, 4};  // Example prices
        int profit = maxProfit(stockPrices);
        System.out.println("Max Profit (1 transaction): $" + profit);
        
        
        // for(int price : stockPrices){
        //     System.out.println(price);
        // }

        
    }
}
