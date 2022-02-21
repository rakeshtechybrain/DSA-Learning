public class FindIslanMaxArea {

    public static void main(String[] args) {

        int[][] board = new int[][]{

        };

        int maxArea = getMaxArea(board);

    }

    private static int getMaxArea(int[][] board) {
        int max=0;
        for(int i=0;i<board.length;i++){
            for (int j=0;j<board[i].length;j++){
                if(board[i][j]==1){
                    max=Math.max(max,dfs(board,i,j));
                }

            }

        }
        return max;
    }

    private static int dfs(int[][] board, int i, int j) {
        //boundra condition
        if(i<0||j<0||i>=board.length||j>=board[i].length||board[i][j]==0){
            return  0;
        }
        board[i][j]=0;
        int count=1;
        count+=dfs(board,i+1,j);
        count+=dfs(board,i-1,j);
        count+=dfs(board,i,j+1);
        count+=dfs(board,i,j-1);

        return count;

    }

}
