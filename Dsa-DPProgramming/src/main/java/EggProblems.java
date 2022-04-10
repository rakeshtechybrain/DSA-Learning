public class EggProblems {

    public static void main(String[] args) {

        int egg = 3;
        int floor = 14;

        int minAttempt = findMinAttempt(egg, floor);

        System.out.println(minAttempt);
    }

    private static int findMinAttempt(int n, int k) {


        int[][] dp = new int[n + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= k; j++) {

                //base case
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 1) {
                    dp[i][j] = i;

                } else {
                    int min = Integer.MAX_VALUE;
                    for (int mj = j - 1, pj = 0; mj >= 0; mj--, pj++) {

                        int v1 = dp[i][mj];
                        int v2 = dp[i - 1][pj];
                        int val = Math.max(v1, v2);
                        min = Math.min(val, min);


                    }
                    dp[i][j] = min + 1;

                }


            }


        }

        return dp[n][k];

    }
}
