import java.util.*;

public class SlidingWindows {


    public static void main(String[] args) {
        int[] nums = {1, 2, -3, 4, 1, -5, 6, 7};
        int k = 3;
        findMSum(nums, k);
        //  findMSum1(nums,k);

        // List<Integer> result = maxElementInKWindos(nums, k);  //using priority Queeu   TC- O(nlogk)  SC-O(k)
        //  List<Integer> result1 = maxElementInKWindowsDeque(nums, k);//using deque

        //for (int x : result) {
        //    System.out.println(x);
        // }


    }

    ///{1, 2, -3, 4, 1,-5, 6, 7};
    private static void findMSum(int[] nums, int k) {

        for (int i = 0; i <= nums.length - k; i++) {
            System.out.print(nums[i]);
            System.out.print("-> ");
            int sum = nums[i];
            for (int j = 1; j < k; j++) {
                System.out.print(", ");
                System.out.print(nums[i + j]);
                sum += nums[i + j];
            }
            System.out.println(" sum " + sum);
        }
    }

    private static List<Integer> maxElementInKWindowsDeque(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();
        int i;
        for (i = 0; i < k; ++i) {

            while (!dq.isEmpty() && nums[i] > nums[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);

        }

        for (; i < nums.length; ++i) {

            res.add(nums[dq.peek()]);

            while (!dq.isEmpty() && dq.peekLast() <= i - k) {
                dq.removeFirst();

            }

            while (!dq.isEmpty() && nums[i] > nums[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);

        }

        return res;
    }

    private static List<Integer> maxElementInKWindos(int[] nums, int k) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> res = new ArrayList<>();
        int i = 0;

        for (; i < k; i++) {
            priorityQueue.add(nums[i]);
        }
        res.add(priorityQueue.peek());
        priorityQueue.remove(nums[0]);


        for (; i < nums.length; i++) {

            priorityQueue.add(nums[i]);
            res.add(priorityQueue.peek());
            priorityQueue.remove(nums[i - k + 1]);
        }
        return res;

    }
}
