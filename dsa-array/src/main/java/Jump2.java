public class Jump2 {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jump2(nums));
    }

    private static int jump2(int[] nums) {
        //base condition
        if (nums.length <= 1) return 0;

        int ladder = nums[0];
        int stare = nums[0];
        int jump = 1;

        for (int i = 1; i < nums.length; i++) {
            if (i == nums.length - 1) return jump;
            if (i + nums[i] > ladder) ladder = i + nums[i];
            stare--;
            if (stare == 0) {
                jump++;
                stare = ladder - i;
            }


        }

    return jump;
    }
}
