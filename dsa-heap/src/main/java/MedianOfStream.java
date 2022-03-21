import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfStream {

    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    private static PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public static void main(String[] args) {

        insert(1);
        System.out.println(median());
        insert(3);
        insert(6);
        System.out.println(median());
        insert(11);
        insert(9);
        insert(19);
        System.out.println(median());
    }

    public static void insert(int num) {

        if (maxHeap.isEmpty() || num <=maxHeap.peek()) {

            maxHeap.add(num);

        } else {
            minHeap.add(num);
        }



        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (maxHeap.size() < minHeap.size()) {
            maxHeap.add(minHeap.poll());
        }

    }


    private static double median() {
        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            return maxHeap.peek();
        }

    }
}
