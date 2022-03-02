public class PlandromProblems {



    public static boolean isPlaindrom(String str){
        int start=0;
        int end=str.length()-1;

     while(start<end){
            if(str.charAt(start)!=str.charAt(end)){

                return validPlandrom(str,start+1,end)||validPlandrom(str,start,end-1);
            }

                start++;
                end--;


        }
        return true;
    }

    private static boolean validPlandrom(String str, int i, int j) {
        while(i<j){

            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
