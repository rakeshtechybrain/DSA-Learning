import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SlidingWidowmaxSubstringWithoutDuplicatCharacter {


    public static void main(String[] args) {
        String str="pwwkew";

        int length=maxSubStringWithoutDuplicateChar(str);
        System.out.println(length);


    }

    //dow wtith Sliding window

    private  static int maxSubStringWithoutDuplicateChar(String str) {

        int start=0;
        int end=start+1;
        Map<Character,Integer> map=new HashMap();
        map.put(str.charAt(start),1);
        int max=0;

        while(end<str.length()){

            if(map.get(str.charAt(end))==null){
                map.put(str.charAt(end),1);
                end++;
            }
            else{

                max=Math.max(max,(end-start)+1);
                map.put(str.charAt(start),map.get(str.charAt(start)-1));
                start++;
            }


        }


return max;

    }


}
