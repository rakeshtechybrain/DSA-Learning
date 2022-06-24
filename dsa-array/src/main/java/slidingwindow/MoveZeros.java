package slidingwindow;

public class MoveZeros {


    public static void main(String[] args) {
    // int[] nums={0,1,0,3,12};
        int[] nums={0};

        moveZeroes(nums);

    }
    public static void moveZeroes1(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        for(int k=j;k<nums.length;k++){
            nums[k]=0;
        }


    }


    public static void moveZeroes(int[] nums) {

        int l=0;int r=0;
        while(l<nums.length && r<nums.length){

            if(nums[r]==0){
                r++;

            }
            else{

                swapValue(nums[r],nums[l],nums,r,l);
                r++;
                l++;

            }



        }

 System.out.print(nums);

    }

    private static void swapValue(int num1, int num2,int []nums,int r,int l) {
      nums[r]=num2;
              nums[l]=num1;
    }
}
