public class EditDistance {

    public static void main(String[] args) {
        //I/R/Rep
        String s1 = "abc";
        String s2 = "bcd";


        int result = findEditOperation(s1, s2, s1.length(), s2.length());


    }

    private static int findEditOperation(String s1, String s2, int m, int n) {

        int dp[][] = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {

            for (int j = 0; j <= n; j++) {

                if (i == 0) {
                    dp[i][j] = j;
                }

                else if (j == 0) {
                    dp[i][j] = i;
                }

                else if (s1.toCharArray()[i - 1] == s2.toCharArray()[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1];

                }
                else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j])) + 1;
                }


            }


        }


        return dp[m + 1][n + 1];
    }
}
