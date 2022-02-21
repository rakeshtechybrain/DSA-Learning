public class NoOfIsland {
    public static void main(String[] args) {

        char[][] board = new char[][]{

        };

        int maxArea = NumOfIsLand(board);
    }


    private static int NumOfIsLand(char[][] board) {
        int noOfIsland = 0;

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] == '1')
                {

                    if (board[i][j] == '1')
                        noOfIsland += dfs1(board, i, j);
                }noOfIsland += dfs1(board, i, j);
            }
        }

        return noOfIsland;

    }

    private static int dfs1(char[][] board, int i, int j) {
        //bondry condition
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length || board[i][j] != '1') {
            return 0;
        }
        board[i][j] = '0';
        dfs1(board, i + 1, j);
        dfs1(board, i - 1, j);
        dfs1(board, i, j + 1);
        dfs1(board, i, j - 1);

        return 1;


    }


}
