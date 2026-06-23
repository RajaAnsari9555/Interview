public class Buy_StockandSell{
    public static int buy_Stock(int[] prices){
        int buy_stock = prices[0];
        int max_profit = 0;
        for(int i =0; i<prices.length ; i++){
            if(prices[i] < buy_stock){
                buy_stock=prices[i];
            }
            else{
             int curr_profit  = prices[i]- buy_stock;
             max_profit = Math.max(max_profit, curr_profit);
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(buy_Stock(prices));
      
    }
}