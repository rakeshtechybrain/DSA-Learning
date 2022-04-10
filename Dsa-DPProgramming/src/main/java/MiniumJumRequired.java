import java.util.Arrays;

public class MiniumJumRequired {

    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 2, 3, 4, 5, 1, 2, 8};
        int[] min_jump_req = new int[arr.length];
        Arrays.fill(min_jump_req,Integer.MAX_VALUE);
        min_jump_req[0]=0;

        minJumpReq(arr, min_jump_req);

    }

    private static void minJumpReq(int[] args, int[] min_jump_req) {


        for (int i = 1; i < args.length; i++) {

            for (int j = 0; j < i; j++) {

                if (i <= j + args[j]) {

                    min_jump_req[i] = Math.min(min_jump_req[i], 1 + min_jump_req[j]);

                }


            }
        }

        System.out.println(min_jump_req[min_jump_req.length-1]);


    }
}
