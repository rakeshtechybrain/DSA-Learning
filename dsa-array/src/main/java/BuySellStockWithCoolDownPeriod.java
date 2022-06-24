public class BuySellStockWithCoolDownPeriod {


    private int maxProfit(int[] prices) {

        int n=prices.length;
        if(n<=1) return 0;
        int[] noStoockState=new int[n];
        int[] inHandStockState=new int[n];
        int[] SoldStockState=new int[n];

        noStoockState[0]=0;
        inHandStockState[0]=-prices[0];
        SoldStockState[0]=0;


        for(int i=1;i<n;++i){
            noStoockState[i]= Math.max(noStoockState[i-1],SoldStockState[i-1]);
            inHandStockState[i]=Math.max(inHandStockState[i-1],noStoockState[i-1]-prices[i]);
            SoldStockState[i]=inHandStockState[i-1]+prices[i];

        }

    return Math.max(noStoockState[n-1],SoldStockState[n-1]);


    }
}
