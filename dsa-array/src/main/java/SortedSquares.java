import java.util.Arrays;

public class SortedSquares {

    public static void main(String[] args) {
        int[] nums = new int[]{-6, -4, -1, 5, 8, 9};

       // int[] result1 = sortedWithNative(nums);
        int[] result = sortedSquare(nums);

        for (int s : result) {
            System.out.println(s);
        }
    }


    public static int[] sortedWithNative(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);

        return nums;

    }


    private static int[] sortedSquare(int[] nums) {
        //with O(n)
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int i = result.length - 1;
        while (i >= 0) {
            if (nums[start] * nums[start] > nums[end] * nums[end]) {
                result[i--] = nums[start] * nums[start];
                start++;
            } else {
                result[i--] = nums[end] * nums[end];
                end--;
            }

        }

        return result;
    }

}