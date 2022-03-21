import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementInStream {

    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public static void main(String[] args) {


        insert(1);
        insert(9);
        insert(6);
        insert(34);
        insert(11);
        insert(19);
        System.out.println(getKtheelement(3));

    }

    public static void insert(int num) {

      maxHeap.add(num);

    }

    public static int getKtheelement(int k){
        int finalResul=0;

        if(k>maxHeap.size()) return -1;

        for(int i=0;i<k;i++){
            finalResul=maxHeap.poll();
        }

        return finalResul;
    }
}
