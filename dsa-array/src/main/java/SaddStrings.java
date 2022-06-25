public class SaddStrings {
    public static void main(String[] args) {

        System.out.print(addSring("923","912"));

    }
    public static String addSring(String num1, String num2) {

        String res = "";
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;

        while(i >= 0 || j >= 0 || carry != 0){
            int first = i >= 0 ? num1.charAt(i)-'0': 0; //If num1 is Empty so take 0
            int second = j >= 0 ? num2.charAt(j)-'0': 0; //If num2 is Empty so take 0

            i--;
            j--;
            int sum = first + second + carry;
            //We are concatinating the no coming as output by Modulo operator
            res = (sum % 10) + res;
            //We are taking the carry
            carry = sum / 10;
        }
        return res;

    }

}
