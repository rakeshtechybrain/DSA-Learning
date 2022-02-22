import java.util.*;

public class PrevAndNextMinMaxProblem {
    public static void main(String[] args) {
        int[] nums = {2,1,5,6,2,3};
        int[] pMinElement = findPreMinElement(nums);//-1,1,4,1,3,8,-1,1
        int[] pMaxElement = findPreGreaterElement1(nums);//-1,-1,-1,5,-1,-1,73,73
        int[] nMinElement = findNextMinElement(nums); //-1,3,3,1,1,1,-1,-1
        int[] ngreaterElement = findNextGreaterElement(nums); //4,5,8,8,73,-1,9,-1


    }

    private static int[] findNextGreaterElement(int[] nums) {

        int[] ps = new int[nums.length];
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = nums.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }
            if (st.isEmpty()) {

                ps[i] = -1;
            } else {
                ps[i] = st.peek();
            }
            st.push(nums[i]);


        }
        return ps;
    }

    private static int[] findNextMinElement(int[] nums) {
        int[] ps = new int[nums.length];
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = nums.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() >= nums[i]) {
                st.pop();
            }
            if (st.isEmpty()) {

                ps[i] = -1;
            } else {
                ps[i] = st.peek();
            }
            st.push(nums[i]);


        }
        return ps;
    }

    private static int[] findPreGreaterElement1(int[] nums) {
        int[] ps = new int[nums.length];
        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {

            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }
            if (st.isEmpty()) {

                ps[i] = -1;
            } else {
                ps[i] = st.peek();
            }
            st.push(nums[i]);


        }
        return ps;
    }

    public static int[] findPreMinElement(int[] nums) {
        int[] ps = new int[nums.length];
        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {


            while (!st.isEmpty() && st.peek() >= nums[i]) {
                st.pop();
            }
            if (st.isEmpty()) {

                ps[i] = -1;
            } else {
                ps[i] = st.peek();
            }
            st.push(nums[i]);

        }

        return ps;
    }
}
