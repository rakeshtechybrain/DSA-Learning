package slidingwindow.scenario1;

import java.util.List;

public class findSumUpto {
    public static void main(String[] args) {
        int [] arr={1, 7, 4, 3, 1, 2, 1, 5, 1};
        int sum=7;

        findData(arr,sum);
    }

    private static void findData(int[] arr, int sum) {

        int start=0;
        int end=1;
        int currentSum=arr[0];

        if(arr.length==1&& arr[0]!=sum) {
            System.out.println("error");
        }

        while(start<arr.length-1){

             if(sum==currentSum && end-start>1){
                 System.out.println("Success! start"+start+" end "+end );

                 break;
             }
             else if(currentSum>sum){
                 currentSum=currentSum-arr[start];
                 start++;
             }
             else if(currentSum<sum){

                 currentSum=currentSum+arr[end];
                 end++;

             }


        }









    }
}
