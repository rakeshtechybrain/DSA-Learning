public class FibonicNumber {

    static int [] dp=new int[100];
    public static void main(String[] args) {
        System.out.println(fib(6));
    }

    public static int fib(int n) {

        if(n==0) return 0;
        if(n==1) return 1;
        if(dp[n]!=0) return dp[n];

        return dp[n]=fib(n-1)+fib(n-2);


    }
}
