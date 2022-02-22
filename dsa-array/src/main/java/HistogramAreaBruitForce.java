import java.util.ArrayDeque;
import java.util.Deque;

public class HistogramAreaBruitForce {

    public static void main(String[] args) {
        int[] height = {2,3};

        int area = calCulateMaxAre(height);

        System.out.println(area);

    }

    private static int calCulateMaxAre(int[] height) {

        int maxArea = 0;
        int[] ps = findPreMinElement(height);
        int[] ns = findNextMinElement(height);

        for (int i = 0; i < height.length; i++) {

            int area = (ns[i] - ps[i] - 1) * height[i];
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }

    private static int[] findNextMinElement(int[] nums) {
        int[] ns = new int[nums.length];
        Deque<Integer> st = new ArrayDeque<>();
        st.push(nums.length-1);
        ns[nums.length-1]=nums.length;

        for (int i = nums.length - 2; i >= 0; i--) {

            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }
            if (st.isEmpty()) {

                ns[i] = nums.length;
            } else {
                ns[i] = st.peek();
            }
            st.push(i);


        }

        return ns;
    }

    private static int[] findPreMinElement(int[] nums) {
        int[] ps = new int[nums.length];
        Deque<Integer> st = new ArrayDeque<>();
        st.push(0);
        ps[0]=-1;

        for (int i = 0; i < nums.length; i++) {


            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }
            if (st.isEmpty()) {

                ps[i] = -1;
            } else {
                ps[i] = st.peek();
            }
            st.push(i);

        }
        return ps;

    }
}