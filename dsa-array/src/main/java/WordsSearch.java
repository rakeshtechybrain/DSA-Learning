public class WordsSearch {

    public static void main(String[] args) {
        char[][] disct = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        String[] wordTobeSearch = {"ABCCED", "CCED", "BCD"};
    for(String data:wordTobeSearch){
        boolean found = searchWord(disct, data);

        System.out.println("Word :"+data+" "+found);

    }
}





    public static boolean searchWord(char[][] board, String word) {

        boolean[][] visited = new boolean[board.length][board[0].length];

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {

                if (backtrack(board, visited, i, j, 0, word)) return true;
            }
        }

        return false;
    }

    public static boolean backtrack(char[][] board, boolean[][] visited, int row, int col, int index, String word) {

        if (index >= word.length()) return true;

            if (row < 0
                || col < 0
                || row >= board.length
                || col >= board[0].length
                || board[row][col] != word.charAt(index)
                || visited[row][col]) {return false;}

        visited[row][col] = true;

        boolean result = backtrack(board, visited, row - 1, col, index + 1, word)
                || backtrack(board, visited, row + 1, col, index + 1, word)
                || backtrack(board, visited, row, col - 1, index + 1, word)
                || backtrack(board, visited, row, col + 1, index + 1, word);

        if (result) return true;

        visited[row][col] = false;

        return false;
    }



}
