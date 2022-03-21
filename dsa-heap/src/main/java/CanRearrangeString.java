import java.util.*;

public class CanRearrangeString {
    public static void main(String[] args) {
        String str="ababcc";

        System.out.println(isStringRearrange(str));
    }

    private static int isStringRearrange(String str) {
        //count the HighFrequescy;
        Map<Character,Integer> data=new HashMap<>();

        for(char ch:str.toCharArray()){

          data.put(ch,data.get(ch)==null?1:data.get(ch)+1);

        }

        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());

        for(Map.Entry<Character,Integer> data1: data.entrySet()){

            maxHeap.add(data1.getValue());
        }


        if(maxHeap.peek()<=(str.length()-maxHeap.peek()+1)){

            return 1;
        }
        else
            return 0;

    }
}
