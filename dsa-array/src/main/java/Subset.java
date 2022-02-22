import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> subsets = subsetsWithDup(nums);

        for (List<Integer> d : subsets) {
            for (Integer i : d) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> subsets = new ArrayList<>();

        subsetsWithDup(0, nums, new ArrayList<Integer>(), subsets);
        return subsets;

    }


    private  static List<List<Integer>> subsetsWithDup(int index, int[] nums,
                                            ArrayList<Integer> current,
                                            List<List<Integer>> subsets) {

        subsets.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            if(i>index && nums[i-1]==nums[i]) continue;
            current.add(nums[i]);
            subsetsWithDup(i + 1, nums, current, subsets);
            current.remove(current.size() - 1);

        }
        return subsets;


    }
}
