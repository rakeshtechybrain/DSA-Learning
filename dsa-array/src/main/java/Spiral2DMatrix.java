public class Spiral2DMatrix {

    public static void main(String[] args) {

        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] result = printInsprialForm(input);


    }

    private static int[][] printInsprialForm(int[][] input) {

        int left = 0;
        int right = input[0].length - 1;
        int top = 0;
        int bottom = input.length - 1;
        int dir = 0;
        while (left <= right && top <= bottom) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    System.out.println(input[top][i]);
                }
                top++;

            }
            //TOP to Bottom
            if (dir == 1) {
                for (int i = top; i <= bottom; i++) {
                    System.out.println(input[i][right]);

                }
                right--;
            }

            //Right to Left

            if (dir == 2) {
                for (int i = right; i >=left; i--) {
                    System.out.println(input[bottom][i]);

                }
                bottom--;
            }

            //Right to Left

            if (dir == 3) {
                for (int i = bottom; i > left; i--) {
                    System.out.println(input[i][left]);
                }
                left++;

            }

            dir = (dir + 1) % 4;


        }
        return null;
    }
}
