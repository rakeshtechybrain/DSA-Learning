import java.util.LinkedList;
import java.util.Stack;

public class ReverseThewords {

    public static void main(String[] args) {
        String stentence="i like this program very mumuchch";

        //String outPut=reverseWord(stentence);
        String outPut2=reverseWord2(stentence);

        System.out.println(outPut2);
    }

    private static String reverseWord2(String stentence) {

        StringBuffer result=new StringBuffer();
        String [] data=stentence.split(" ");

        int start=0;
        int end=data.length-1;

        while(start<=end){

            String temp=data[start];
            data[start]=data[end];
            data[end]=temp;
            start++;
            end--;

        }

       for(String s:data){
           result.append(s);
           result.append(" ");
       }
        return result.toString();

    }

    private static String reverseWord(String stentence) {
        StringBuffer result=new StringBuffer();

        Stack input=new Stack();

        String [] data=stentence.split("\\.");





        for(String t:data){

            input.push(t);

        }

        while(!input.isEmpty()){

            result.append(input.pop());

            if(!input.isEmpty())
            result.append(".");

        }
        //result.replace(result.length(),result.length()," ");
        return result.toString();
    }
}
