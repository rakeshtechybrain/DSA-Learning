public class BuyAndSellStockAnyTn {

    public static void main(String[] args) {


        int [] stock=new int[]{7,1,5,3,6,4};

        int proit=getProfit(stock);

        System.out.println(proit);
    }

    private static int getProfit(int[] stock) {
        int profit=0;
        for(int  i=1;i<stock.length;i++){
            if(stock[i]>stock[i-1]){
                profit+=stock[i]-stock[i-1];

            }
        }
        return  profit;
    }
}
