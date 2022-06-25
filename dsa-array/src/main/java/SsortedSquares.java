import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.lang.Math.abs;

public class SsortedSquares {

    public static void main(String[] args) {
        int[] nums={-7,-3,2,3,11};
        int []res=sortedSquares(nums);
    }

    public static int [] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;
        int k = nums.length - 1;

        while (k >= 0) {
            if (nums[l] * nums[l] > nums[r] * nums[r]) {
                result[k--] = nums[l] * nums[l];
                l++;
            } else {
                result[k--] = nums[r] * nums[r];
                r--;
            }
        }
    return result;
    }


    }

