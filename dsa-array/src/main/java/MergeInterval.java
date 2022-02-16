import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {

    public static void main(String[] args) {
        int[][] input = {{1,3},{2,6},{8,10},{15,18}};

        merge(input);
    }

    private static void merge(int[][] input) {
        //sorting
        Arrays.sort(input, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int start = input[0][0];
        int end = input[0][1];
        for (int[] i : input) {
            if (i[0] > end) {
                result.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            } else {
                end = Math.max(end, i[1]);
            }


        }

        result.add(new int[]{start, end});


    }
}
