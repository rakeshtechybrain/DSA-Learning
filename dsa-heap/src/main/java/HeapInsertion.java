public class HeapInsertion {


    public static void main(String[] args) {

        int[] maxHeapArray = {Integer.MAX_VALUE, 20, 16, 14, 7, 13, 10, 11, 6, 5};

        //Insert node into Heap and maintain MaxHeapProperty
        //System.out.println("Before Insert isMaxHeap--> " + HeapDSTestClient.isMaxHeap(maxHeapArray));
        //int[] copiedArray = new int[maxHeapArray.length + 1];
       // System.arraycopy(maxHeapArray, 0, copiedArray, 0, maxHeapArray.length);
       // copiedArray[maxHeapArray.length] = 18;
       // maintainMaxHeapProperty(copiedArray, maxHeapArray.length); //O(n)
        //System.out.println("After Insert isMaxHeap--> " + HeapDSTestClient.isMaxHeap(copiedArray));

        //delete node from Heap and maintain MaxHeapProperty
        System.out.println("Before delete isMaxHeap--> " );
       maxHeapArray[1]= maxHeapArray[maxHeapArray.length-1];
       int size=maxHeapArray.length-2;

        maintainMaxHeapPropertyAfterdeletion(maxHeapArray,size);
        System.out.println("After delete isMaxHeap--> " );





    }

    private static void maintainMaxHeapPropertyAfterdeletion(int[] maxHeapArray, int size) {

        int index=1;
        while(index<size){

            int lChild=index*2;
            int rChild=index*2+1;
            int max=-1;

            if(lChild<size && maxHeapArray[index]<maxHeapArray[lChild]){

                //swapValue(maxHeapArray,index,lChild);
                max=lChild;
            }
            else  if(rChild<size && maxHeapArray[max]<maxHeapArray[rChild]){


                max=rChild;
            }
            else if(index!=max){
                swapValue(maxHeapArray,index,max);
            }










        }




    }

    private static void maintainMaxHeapProperty(int[] copiedArray, int index) {

        while (index > 1) {
            int parent = index / 2;
            if (copiedArray[parent] < copiedArray[index]) {
                swapValue(copiedArray, parent, index);
                index = parent;

            } else {
                return;
            }


        }


    }

    private static void swapValue(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;

    }


}
