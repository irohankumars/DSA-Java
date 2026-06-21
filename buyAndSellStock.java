public class buyAndSellStock {
    
    public static int BuyAndSellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i=1;i<=prices.length -1;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);

            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]){
        int prices[] = {7, 6, 4,  3, 1};

        System.out.println(BuyAndSellStock(prices));


    }

}
