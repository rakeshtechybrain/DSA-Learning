import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetWithDuplicateInput {

    public static void main(String[] args) {

        int[] numbs = {1, 2, 3};

        subsetUnique(numbs);
    }

    private static List<List<Integer>> subsetUnique(int[] numbs) {

        Arrays.sort(numbs);
        List<List<Integer>> subset = new ArrayList<>();
        genrateSubSet(0, numbs, new ArrayList<Integer>(), subset);
        return subset;

    }

    private static List<List<Integer>> genrateSubSet(int index, int[] numbs,
                                                     ArrayList<Integer> current,
                                      List<List<Integer>> subset) {

        subset.add(new ArrayList<>(current));


        for (int i = index; i < numbs.length; i++) {
            current.add(numbs[i]);
            genrateSubSet(i + 1, numbs, current, subset);
            current.remove(current.size() - 1);

        }
return subset;
    }

}
