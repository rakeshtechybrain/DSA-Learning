import java.util.HashSet;
import java.util.Set;

public class RemoveDups {

    public static void main(String[] args) {
       // removeDups("ffgghjty");  //TC--O(n)---SP---O(n)

        removeDupsEfficient("geekgeek");
    }

    private static void removeDupsEfficient(String s1) {

        int arr[]= new int[26];
        String s2="";
        char s1arr[]=s1.toCharArray();

            for(int i=0 ;i<s1.length();i++){
                char x= s1arr[i];

                if( arr[x - 'a'] == 0){
                    arr[x -'a'] =1;
                    s2+=x;
                }
            }

            System.out.println(s2);

        }



    private static void removeDups(String feghty) {

        Set<Character> set= new HashSet();
        StringBuffer sub=new StringBuffer();

        for(char ch:feghty.toCharArray()){

            if(!set.contains(ch)){
                sub.append(ch);
                set.add(ch);
            }

        }

        System.out.println(sub.toString());



    }

}
