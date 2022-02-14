import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class majorityElement2 {

    public List<Integer> majorityElement(int[] nums) {

        int k = nums.length/3;
        HashMap<Integer , Integer> map = new HashMap<>();
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
