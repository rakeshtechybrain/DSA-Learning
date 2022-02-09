public class BuySellStock {

    public static void main(String[] args) {
        int[] arr =new int[]{5,1,4,6,7,8,4,3,7,9,4};

        int profit=solutionBuySellStockOnce(arr);

        System.out.println(profit);
    }

    private static int solutionBuySellStockOnce(int[] arr) {
        int profit=0;
        int minValue=Integer.MAX_VALUE;

        for (int i=0;i<arr.length;i++){

            minValue=Math.min(minValue,arr[i]);
            profit=Math.max(profit,arr[i]-minValue);
        }


        return profit;
    }
}
