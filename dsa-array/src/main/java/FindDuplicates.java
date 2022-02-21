import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

    public static void main(String[] args) {
        int [] nums=new int[]{4,3,2,7,8,2,3,1};
        List<Integer> rs=findAllduplicate(nums);

        for (Integer data:rs){
            System.out.println(data);
        }
    }

    private static List<Integer> findAllduplicate(int[] nums) {

        //find the max value from array
        int max=Integer.MIN_VALUE;
        for(int x=0;x<nums.length;x++){

            max=Math.max(max,nums[x]);
        }

        int [] check=new int[max+1];
        List<Integer> result=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(check[nums[i]]==0){
                check[nums[i]]=-1;
            }
            else{
                result.add(nums[i]);
            }

        }


        return  result;
    }


}
