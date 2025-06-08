public class stockBuyandSell {
     public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;  // new buying day
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);  // selling day
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        stockBuyandSell s = new stockBuyandSell();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(s.maxProfit(prices));  // Output: 5 (buy at 1, sell at 6)
    }
}
