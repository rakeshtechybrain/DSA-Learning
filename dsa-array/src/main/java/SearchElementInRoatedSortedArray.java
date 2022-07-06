import java.util.List;

public class SearchElementInRoatedSortedArray {

    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;


        while (low <= high) {
            //find out soreted lef or right
            int mid =  low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[low]<=nums[mid]) {
                //left side sorted

                if (target >= nums[low] && target < nums[mid]) {

                    high = mid - 1;
                } else {
                    low = mid + 1;
                }


            } else {
                //right side sorted
                if (target > nums[mid] && target <= nums[high]) {

                    low = mid + 1;

                } else {
                    high = mid - 1;
                }


            }
        }

        return -1;
    }
}
