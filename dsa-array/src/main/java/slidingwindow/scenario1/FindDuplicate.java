package slidingwindow.scenario1;

public class FindDuplicate {

    public static void main(String[] args) {

        //int[] arr = {5, 6, 8, 2, 4, 6, 9};
        //int k = 4;

        int[] arr = { 5, 6, 8, 2, 4, 6, 9 };
        int k = 2;

        //int[] arr = {1, 2, 3, 2, 1};
        //int k = 7;

        boolean isDuplicateFound = findDuplicate(arr, k);

        System.out.println(isDuplicateFound);

    }

    private static boolean findDuplicate(int[] arr, int k) {

        int start = 0;
        int end = 1;
        int arrayBoundary = 0;

        if (k > arr.length) {
            arrayBoundary = arr.length;
        } else {
            arrayBoundary = arr.length - k;
        }
        while (start < arrayBoundary) {
            if (end - start < k) {

                if (arr[start] == arr[end]) {

                    return true;
                } else {

                    end++;
                }

            } else {
                if (arr[start] == arr[end]) {
                    start++;
                    if (end - start < k) {
                        return true;
                    }


                } else {
                    start++;
                }

            }


        }


        return false;
    }

}
