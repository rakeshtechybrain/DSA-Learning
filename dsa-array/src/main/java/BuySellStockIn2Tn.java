public class BuySellStockIn2Tn {

    public static void main(String[] args) {
        int[] arr =new int[]{3,3,5,0,0,3,1,4};

        int profit=solutionBuySellStockIn2Tn(arr);

        System.out.println(profit);
    }

    private static int solutionBuySellStockIn2Tn(int[] arr) {
        int profit1=0;
        int minValue1=Integer.MAX_VALUE;
        int profit2=0;
        int minValue2=Integer.MAX_VALUE;

        for (int i=0;i<arr.length;i++){

            minValue1=Math.min(minValue1,arr[i]);
            profit1=Math.max(profit1,arr[i]-minValue1);

            minValue2=Math.min(minValue2,arr[i]-profit1);
            profit2=Math.max(profit2,arr[i]-minValue2);

        }


        return profit2;
    }


}
