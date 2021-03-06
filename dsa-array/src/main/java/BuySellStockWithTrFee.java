public class BuySellStockWithTrFee {


    public int maxProfit(int[] prices, int fee) {
        int profit=0;
        int effectiveBuyPrice=prices[0];

        for(int i=1;i<prices.length;i++){

            profit=Math.max(profit,prices[i]-effectiveBuyPrice-fee);
            effectiveBuyPrice=Math.min(effectiveBuyPrice,prices[i]-profit);

        }

        return profit;

    }
    private int maxProfit(int[] prices) {

        int n=prices.length;
        if(n<=1) return 0;
        int profit;

        int[] buyStockstate=new int[n];
        int[] SoldStockState=new int[n];

        buyStockstate[0]=prices[0];
        SoldStockState[0]=0;
        profit=0;
        int fee=2;


        for(int i=1;i<n;i++){
            buyStockstate[i]= Math.min(buyStockstate[i-1],prices[i]-profit);
            SoldStockState[i]=Math.max(profit,prices[i]-buyStockstate[i-1]-fee);
            profit=SoldStockState[i];

        }

        return profit;



    }
}
