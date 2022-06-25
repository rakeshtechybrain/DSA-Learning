public class PatternMatching {

    public static void main(String[] args) {
        strStr("Hello","ll");
    }
//hello
  //  ll
    public static int strStr(String haystack, String needle) {

        if(haystack==null||needle==null||needle.length()>haystack.length())
            return -1;
        if(needle.length()==0) return 0;

        for(int i=0;i<haystack.length()-needle.length()+1;i++){

            if(haystack.charAt(i)==needle.charAt(0)){

                System.out.println("Hello".substring(2,4));
                System.out.println(haystack.substring(i,needle.length()+i));

                if(haystack.substring(i,needle.length()+1).equals(needle)){
                    return  i;
                }
            }


        }

        return -1;
    }
}
