import java.util.Arrays;
import java.util.Collection;
import java.util.PriorityQueue;

public class SSolution {
    public void sortColors(int[] nums) {
        PriorityQueue pq = new PriorityQueue();
        for(int i : nums){
            pq.add(i);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]= (int) pq.poll();
        }
    }
    void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public void sortColorsDutchFlag(int[] nums) {


        int l=0,h=nums.length-1,mid=0;
        while(mid<=h){
            if(nums[mid] == 0){
                swap(nums[mid],nums[l]);
                l++;mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums[mid],nums[h]);
                h--;
            }
        }

    }
}
