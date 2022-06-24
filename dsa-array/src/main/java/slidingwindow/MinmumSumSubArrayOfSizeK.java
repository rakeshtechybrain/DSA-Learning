package slidingwindow;


/*

Requirment: size unbound
any specialcases



 */
public class MinmumSumSubArrayOfSizeK {

    public static void main(String[] args) {

        int[] array = {10, 4, 2, 5, 6, 3, 8, 1};
        int windowSize = 3;
      //  int resultMinSub = findUsingBruitFource(array, windowSize);
      //  System.out.print(resultMinSub);

        findSubarray(array, windowSize);


    }

    public static void findSubarray(int[] arr, int k)
    {
        // base case
        if (arr.length == 0 || arr.length <= k) {
            return;
        }
        // stores the sum of elements in the current window
        int window_sum = 0;

        // stores the sum of minimum sum subarray found so far
        int min_window = Integer.MAX_VALUE;

        // stores ending index of the minimum sum subarray found so far
        int last = 0;

        for (int i = 0; i < arr.length; i++)
        {
            // add the current element to the window
            window_sum += arr[i];


            // if the window size is more than equal to `k`
            if (i + 1 >= k)
            {
                // update the minimum sum window
                if (min_window > window_sum)
                {
                    min_window = window_sum;
                    last = i;
                }

                // remove a leftmost element from the window
                window_sum -= arr[i + 1 - k];
            }




        }

        System.out.printf("The minimum sum subarray is (%d, %d)", last - k + 1, last);




    }

    private static void findUsinSlidingWindow(int[] array, int windowSize) {









        int start = 0;
        int end = 0;
        int cout = windowSize;
        int result = Integer.MAX_VALUE;
        int currSum = 0;

        while (start <= array.length - windowSize) {

            while (cout > 0) {
                currSum = currSum + array[end++];
                cout--;
            }
            result = Math.min(result, currSum);

            if (cout <=0) {
                currSum = currSum-array[start++];

                cout++;


            }


        }

        System.out.println(result);


    }

    private static int findUsingBruitFource(int[] array, int windowSize) {

        int result = 0;
        int minSum = Integer.MAX_VALUE;
        int sPoint = -1;
        int ePoint = -1;

        for (int startPoint = 0; startPoint < array.length - windowSize; startPoint++) {
            int currentMinSum = 0;
            for (int j = startPoint; j <= startPoint + 2; j++) {
                currentMinSum = currentMinSum + array[j];
            }
            if (currentMinSum < minSum) {
                sPoint = startPoint;
                ePoint = startPoint + windowSize - 1;
                minSum = currentMinSum;
            }


        }


        System.out.println(sPoint);
        System.out.println(ePoint);
        return minSum;
    }

}
