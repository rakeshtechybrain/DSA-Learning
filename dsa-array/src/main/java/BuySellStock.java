public class BuySellStock {

    public static void main(String[] args) {
        int arr[]={5,1,4,6,7,8,4,3,7,9};

        int profit=solutionBuySellStockOnce(arr);

        System.out.println(profit);
    }

    private static int solutionBuySellStockOnce(int[] arr) {
        int profit=0;
        int minValue=Integer.MAX_VALUE;

        for (int i=0;i<arr.length;i++){
            profit=Math.max(profit,arr[i]-minValue);
            minValue=Math.min(minValue,arr[i]);
        }


        return profit;
    }
}
