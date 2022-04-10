public class KnapSnapBruitForce {

    public static void main(String[] args) {
        int capacity = 10;
        int[] itemWeight = {1, 3, 4, 6};
        int[] itemPrice = {20, 30, 10, 50};

        int maxProfit = knapSnapProbUsingBritForce(itemWeight, itemPrice, capacity); //O(2 pow n)


    }

    private static int knapSnapProbUsingBritForce(int[] itemWeight, int[] itemPrice, int capacity) {
        int maxProfit = 0;

        for (int i = 0; i < itemWeight.length; i++) {

            for (int j = 0; j < itemWeight.length; j++) {


                if (itemWeight[i] + itemWeight[j] <= capacity) {
                    int profit = itemPrice[i] + itemPrice[j];

                    maxProfit = Math.max(profit, maxProfit);

                }


            }


            return maxProfit;

        }
        return maxProfit;
    }
}

