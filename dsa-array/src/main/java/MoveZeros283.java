public class MoveZeros283 {

    public static void main(String[] args) {

        int[] num = new int[]{0, 2, 0, 3, 7, 5, 9, 0};

        int[] result = moveZeroBruitForce(num);
        int[] result2=moveZeroOptimalSolution(num);

        for (int data : result2) {
            System.out.print(data);
        }

    }

    private static int[] moveZeroOptimalSolution(int[] num) {
        int lastNonZeroFoundAt = 0;
        // If the current element is not 0, then we need to
        // append it just in front of last non 0 element we found.
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                num[lastNonZeroFoundAt++] = num[i];
            }
        }
        for (int i = lastNonZeroFoundAt; i < num.length; i++) {
            num[i] = 0;
        }
    return num;
    }

    private static int[] moveZeroBruitForce(int[] num) {
        int[] result = new int[num.length];
        int count = 0;
        int pointerOne = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                count++;
            } else {
                result[pointerOne++] = num[i];
            }
        }

        if (count > 0) {
            while (count > 0) {

                result[pointerOne++] = 0;
                count--;
            }

        }

        return result;
    }


}
