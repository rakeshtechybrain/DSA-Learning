import java.util.HashMap;
import java.util.Map;

public class SlongestkSubstr {


    public static void main(String[] args) {

       System.out.println(longestkSubstr("meayg",2));
    }

    public static  int longestkSubstr(String s, int k) {

        int start=0;

        int ans=0;
        Map<Character,Integer> characterFreq=new HashMap<>();

        //K=3
        for(int end=0;end<s.length();end++){
            char c=s.charAt(end);
            characterFreq.put(c,characterFreq.getOrDefault(c,0)+1);

            while(characterFreq.keySet().size()>k){
                char c1=s.charAt(start);
                if(characterFreq.get(c1)==1) {
                    characterFreq.remove(c1);
                }else{
                    characterFreq.put(c1,characterFreq.get(c1)-1);
                }
                start++;
            }

           ans=Math.max(ans,end-start+1);



        }
        if(characterFreq.size()<k) ans=-1;

        return ans;

    }
}
