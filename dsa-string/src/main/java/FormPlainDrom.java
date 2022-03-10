public class FormPlainDrom {

    public static void main(String[] args) {
        String s1="geeks";
        String s2="skeeg";// rverse on s1;

        System.out.println(s1.length()-requiredCOuntFormlainDron(s1,s2,s1.length()));



    }

    private static  int  requiredCOuntFormlainDron(String s1, String s2, int length) {
        int [][] DP=new int[length+1][length+1];

        for(int i=0;i<=length;i++){

            for(int j=0;j<=length;j++){

                    if(i==0||j==0){
                        DP[i][j]=0;
                    }else if(s1.toCharArray()[i-1]==s2.toCharArray()[j-1]){
                        DP[i][j]=1+DP[i-1][j-1];
                    }
                    else{
                        DP[i][j]=Math.max(DP[i-1][j],DP[i][j-1]);
                    }

            }
        }

       return DP[length][length];



    }



}
