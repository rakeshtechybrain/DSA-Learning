import java.util.Arrays;

public class DPMinCoinProblem {


    public static void main(String[] args) {

        int [] arrayOfCoin={7,5,1};
        int n=18;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        System.out.println(minCoins(n,arrayOfCoin,dp));



    }

    //--O(m power n)
    //--O(m*n)--using DP
    private static int minCoins(int n, int[] arrayOfCoin,int[] dp) {
        //use base Condition
        if(n==0) return 0;
        int ans=Integer.MAX_VALUE;

        for(int i=0;i<arrayOfCoin.length;i++) {
            if (n - arrayOfCoin[i] >= 0) {
                int subAns=0;
                    if(dp[n-arrayOfCoin[i]]!= -1) {

                        subAns=dp[n-arrayOfCoin[i]];
                    }
                    else{
                        subAns = minCoins(n - arrayOfCoin[i], arrayOfCoin, dp);
                    }
                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }


            }
        }

       return dp[n]=ans;
    }
}
