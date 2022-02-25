public class ReverseArrayByK {

    public static void main(String[] args) {
        String [] nums={"a","b","c","d","e","f","g"};
        int k=-3; //postive or negative  +--left rotation,- right rotation
        rotateArrayByk(nums,k); //e,f,g,a,b,c,d
    }

    private static void rotateArrayByk(String[] nums,int k) {

        k=k%nums.length;
        if(k<0){
            k=k+nums.length;
        }

        //part 1 reverse
        reverse(nums,0,nums.length-k-1);

        //part 2 reverse
        reverse(nums,nums.length-k,nums.length-1);

        //all reverse
        reverse(nums,0,nums.length-1);

        for (String data:nums){
            System.out.println(data);
        }


    }

    private static void reverse(String[] nums,int i,int j){
        int left=i;
        int right=j;

        while (left <right) {
            String temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            right--;
            left++;
        }
    }
}
