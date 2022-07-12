package Problem.of.the.day.GFG.july;

import java.util.ArrayList;

public class July10findAllPossiblePaths {

    public static void main(String[] args) {
        int [][]grid={{1,2,3},{4,5,6}};
        int row=2;
        int col=3;
        ArrayList<ArrayList<Integer>> ans=findAllPossiblePaths(row,col,grid);
    }


    public static ArrayList<ArrayList<Integer>> findAllPossiblePaths(int row, int col, int[][] grid) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        int i = 0;
        int j = 0;
        curr.add(grid[0][0]);
        dfs(ans, curr, i, j, grid);
        return ans;
    }

    static void dfs(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr, int i, int j, int[][] grid) {

        //base case
        if (i == grid.length - 1 && j == grid[0].length-1) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (isValid(i + 1, j, grid)) {
            curr.add(grid[i + 1][j]);
            dfs(ans, curr, i + 1, j, grid);
            curr.remove(curr.size() - 1);
        }

        if (isValid(i, j + 1, grid)) {
            curr.add(grid[i][j + 1]);
            dfs(ans, curr, i, j + 1, grid);
            curr.remove(curr.size() - 1);
        }


    }

    static boolean isValid(int i, int j, int[][] grid) {
        if (i == grid.length|| j == grid[0].length) {
            return false;
        } else {
            return true;
        }
    }


}
