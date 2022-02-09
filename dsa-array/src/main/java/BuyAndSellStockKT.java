public class BuyAndSellStockKT {

    public static void main(String[] args) {

        int[] arr = new int[]{3,2,6,5,0,3};
        int k = 2;

        int profit = solutionBuySellStockInKt(arr, k);

        System.out.println(profit);


    }

    public static int solutionBuySellStockInKt(int[] price, int k) {
        int profit = 0;
        if (k <= 0 || price.length <= 0) return 0;
        if (k == price.length / 2) {
            return helper(price);
        }
        int[] minPrice = new int[k];

        int[] mprofit = new int[k];
        for (int i = 0; i < k; i++) {
            minPrice[i] = Integer.MAX_VALUE;
            mprofit[i] = 0;
        }

        for (int i = 0; i < price.length; i++) {
            for (int j = 0; j < k; j++) {

                minPrice[j] = Math.min(minPrice[j], price[i] - (j>0?mprofit[j - 1]:0));
                mprofit[j] = Math.max(mprofit[j], price[i] - minPrice[j]);
            }


        }


        return mprofit[k - 1];
    }

    private static int helper(int[] price) {

        int profit = 0;
        for (int i = 1; i < price.length; i++) {
            if (price[i] > price[i - 1]) {
                profit += price[i] - price[i - 1];

            }
        }
        return profit;
    }
}
