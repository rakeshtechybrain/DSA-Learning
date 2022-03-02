public class Add2StringLeetCode415 {

    public String longestCommonPrefix(String[] strs) {


        int count=0;
        StringBuffer sb=new StringBuffer();

       for(int i=0;i<strs.length;i++){

           char a=strs[i].charAt(count);
           char b=strs[i].charAt(count);
           char c=strs[i].charAt(count);

           if(a==b && b==c){
               sb.append(a);
               count++;
           }
           if(sb.length()==0){

               return "";
           }




       }
       return sb.toString();
    }


    public static String add2String(String num1,String num2){

        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;

        StringBuilder sb = new StringBuilder();
        while(i>=0 && j>=0){

            int a=num1.charAt(i)-'0';
            int b=num2.charAt(j)-'0';

            int res = a + b + carry;
            carry = res / 10;
            sb.append(res % 10);
            i--;
            j--;

        }

        while(i>=0){

            int a=num1.charAt(i)-'0';

            int res = a  + carry;
            carry = res / 10;
            sb.append(res % 10);
            i--;

        }
        while (j >= 0) {
            int b = num2.charAt(j) - '0';
            int res = b + carry;
            carry = res / 10;
            sb.append(res % 10);
            j--;
        }
        if (carry >0) {
            sb.append(carry);
        }
        return sb.reverse().toString();


    }

}
