import java.util.HashMap;
import java.util.Map;

public class TwoSumSolutions {

    public static void main(String[] args) {

        int [] nums ={2,7,11,15};
        int target=9;
        int[] ans=twoSum(nums,target);
        for (int an : ans) {
            System.out.print(an+", ");

        }

    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map= new HashMap<>(nums.length);
        int ans[]=new int[2];

        for(int i=0;i<nums.length;i++){

            if(map.containsKey(target-nums[i])){


                ans[1]=  map.get(target-nums[i]);
                ans[0]=i;
            }
            else{
                map.put(nums[i],i);
            }


        }

    return ans;

    }
}
