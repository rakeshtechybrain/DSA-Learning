import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.TreeMap;

public class StringPermutation {

    public static void main(String[] args) {

        String str = "AABC";
        //int n = str.length();

        //permute(str, 0, n-1);

        permutationWithDuplicateCgharacter(str.toCharArray());

    }

    private static void permutationWithDuplicateCgharacter(char @NotNull [] input) {

        Map<Character, Integer> countMap = new TreeMap<Character, Integer>();
        for (char ch : input)
            countMap.compute(ch, (key, value) -> {
                if (value == null) return 1;
                else
                    return value + 1;

            });

        char[] str = new char[countMap.size()];
        int[] count = new int[countMap.size()];
        char[] result = new char[input.length];
        //fill the str and count array
        int index = 0;
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {

            str[index] = entry.getKey();
            count[index] = entry.getValue();
            index++;

        }

        permutation(str, count, result, 0);


    }

    private static void permutation(char[] str, int[] count, char @NotNull [] result, int level) {

        if (result.length == level) {
            //print the result array
            printArray(result);
            return;
        }
        for (int i = 0; i < str.length; i++) {
            if (count[i] == 0) continue;
            result[level] = str[i];
            count[i]--;
            permutation(str, count, result, level + 1);
            count[i]++;


        }


    }

    private static void printArray(char @NotNull [] result) {

        for (char ch : result) {
            System.out.print(ch);
        }
        System.out.println(" ");
    }


    private static void permute(String str, int l, int r) {

        if (l == r) System.err.println(str);

        for (int i = l; i <= r; i++) {
            str = swap1(str, l, i);
            permute(str, l + 1, r);
            str = swap1(str, l, i);
        }


    }

    public static @NotNull String swap1(@NotNull String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
