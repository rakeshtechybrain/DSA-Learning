import java.util.*;

public class SFibSeries {

    int [] arr=new int[100];
    public int fib(int n) {

        if(n==0) return 0;
        if(n==1) return 1;
        if(arr[n]!=0) return arr[n];
        return arr[n]= fib(n-1)+fib(n-2);


    }
}
