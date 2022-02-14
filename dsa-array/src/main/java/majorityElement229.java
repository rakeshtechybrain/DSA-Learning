import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class majorityElement229 {

    public static void main(String[] args) {
    int[]nums=new int[]{3,2,3};
        List<Integer> integerList = majorityElement(nums);
       integerList.stream().forEach(x->System.out.println(x));
    }

    public static List<Integer> majorityElement(int[] nums) {

        int k = nums.length/3;
        HashMap<Integer , Integer>map = new HashMap<>();
        for(int i : nums){
            map.put(i , map.getOrDefault(i , 0) + 1);
        }
        List<Integer>list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i]) && (map.get(nums[i])) > k){
                list.add(nums[i]);
                map.remove(nums[i]);
            }
        }
        return list;

    }
}
