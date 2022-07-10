public class BrainGame {

    public static void main(String[] args) {
        int[] nums={2, 4, 7, 11};
        brainGame(nums);

    }

    public static boolean brainGame(int[] nums) {

        int[] a = new int[1005];
        for (int i = 2; i <= 1000; i++) {

            for (int j = 2 * i; j <= 1000; j += i) {

                a[j] = Math.max(a[j], i + a[i]);
            }


        }

        int c=0;
        for(int l=0;l<nums.length;l++){

            c=c^a[nums[l]];
        }
        if(c==0) return false;


        return true;
    }
}
