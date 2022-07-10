public class PermutationPlainDrom {

    public static void main(String[] args) {
        String s="racecar";
        System.out.println(isPermutaionPlainDrom(s));
    }

    public static boolean isPermutaionPlainDrom(String s){


        char [] arrayChar=new char[128];

        for(int i=0;i<s.length();i++){

            arrayChar[s.charAt(i)]++;
        }
        int count=0;

        for(int i=0;i<128;i++){

        count+=arrayChar[i]%2;

        }
    return count<=1;
    }
}
