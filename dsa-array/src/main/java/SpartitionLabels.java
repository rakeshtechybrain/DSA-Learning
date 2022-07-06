import java.util.ArrayList;
import java.util.List;

public class SpartitionLabels {

    public List<Integer> partitionLabels(String s) {

        if(s==null|s.length()==0) return null;
        int[] lastind=new int [26];
        List<Integer> outPut=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            lastind[s.charAt(i)-'a']=i;

        }
        int end=0;int strt=0;
        for(int j=0;j<s.length();j++){

            end=Math.max(end, lastind[s.charAt(j)-'a']);
            if(end==j){
                outPut.add(end-strt+1);
                strt=end+1;
            }


        }
        return outPut;
    }
}
