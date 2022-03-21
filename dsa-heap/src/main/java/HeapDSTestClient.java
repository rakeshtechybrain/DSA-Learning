import org.jetbrains.annotations.NotNull;

public class HeapDSTestClient {

    public static void main(String[] args) {
        int[] maxHeapArray = {Integer.MAX_VALUE, 20, 16, 14, 6, 13, 10, 1, 5, 7, 12};

        boolean isMaxheap = isMaxHeap(maxHeapArray);

    }

    public static boolean isMaxHeap(int @NotNull [] maxHeapArray) {
        boolean flag = true;
        for (int i = 2; i < maxHeapArray.length; i++) {

            if (maxHeapArray[Math.abs(i / 2)] > maxHeapArray[i]) {
                continue;
            } else {
                flag = false;
                updateHepify(maxHeapArray,i);
               System.out.println(" inValid Node Value: "+maxHeapArray[i]);
                break;
            }

        }




        return flag;
    }

    public static void updateHepify(int[] maxHeapArray, int i) {


         while(i>=1) {

             int max = i;
             int left = i * 2;
             int right = 2 * i + 1;

             if (left <= maxHeapArray.length - 1 && maxHeapArray[left] > maxHeapArray[i]) {
                 max = left;
             }
             if (right <= maxHeapArray.length - 1 && maxHeapArray[right] > maxHeapArray[max]) {
                 max = right;
             }
             if (max != i) {
                 swapData(maxHeapArray, i, max);
             }

             updateHepify(maxHeapArray, max);

         }


    }

    private static void swapData(int[] arr,int i, int j) {

        int temp= arr[j];
        arr[j]= arr[i];
        arr[i]=temp;
    }


    public static void maintainMaxHeapProperty(int[] maxHeapArray, int start) {

        for(int i=start/2; i>=1;i--){

            updateHepify(maxHeapArray,maxHeapArray[i]);
        }


    }
}
