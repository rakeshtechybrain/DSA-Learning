public class RotateImage {

    public static void main(String[] args) {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
       getTranposeMatrix(input);
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                System.out.println(input[i][j]);
            }
        }
    }

    private static void getTranposeMatrix(int[][] input) {

        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input[0].length; j++) {
                int temp=0;
                 temp = input[i][j];
                input[i][j] = input[j][i];
                input[j][i] = temp;
            }
        }
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length / 2; j++) {
                int temp=0;
                 temp = input[i][j];
                input[i][j] = input[i][input.length - 1 - j];
                input[i][input.length - 1 - j] = temp;
            }
        }


    }

}
