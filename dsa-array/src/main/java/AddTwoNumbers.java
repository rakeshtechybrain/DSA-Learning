import java.util.*;

public class AddTwoNumbers {


    public static void main(String[] args) {

        int[] num1 = new int[]{9, 9, 3};
        int[] num2 = new int[]{2, 3, 5};

        List<Integer> result = add2numbers(num1, num2);

        for (int i = result.size() - 1; i >= 0; i--) {
            System.out.print(result.get(i));

        }

    }

    private static List<Integer> add2numbers(int[] num1, int[] num2) {

        int sum = 0;
        int carry = 0;
        List<Integer> result = new Stack<>();

        int num1End = num1.length - 1;
        int num2End = num2.length - 1;

        while (num1End >= 0 && num2End >= 0) {

            sum = num1[num1End] + num2[num2End] + carry;
            carry = sum / 10;
            sum = sum % 10;
            result.add(sum);
            num1End--;
            num2End--;
        }

        if (num1End >= 0) {
            while (num1End >= 0) {
                sum = num1[num1End] + carry;
                carry = sum / 10;
                sum = sum % 10;
                result.add(sum);
                num1End--;

            }
        }
        if (num2End >= 0) {
            while (num2End >= 0) {
                sum = num2[num2End] + carry;
                carry = sum / 10;
                sum = sum % 10;
                result.add(sum);
                num2End--;

            }
        }
        if (carry > 0) {
            result.add(carry);
            ;
        }
        return result;
    }


}
