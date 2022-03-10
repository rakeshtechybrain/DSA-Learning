import org.jetbrains.annotations.NotNull;

public class LongestPlaindrom {


    public static void main(String[] args) {

        String input = "fyfvladzpbfudkklrwq";

        System.out.println(longestPlaindrom(input));


    }

    private static @NotNull String longestPlaindrom(@NotNull String input) {

        if (input.length() <= 1) return input;

        int max = 1;
        int st = 0, end = 0;

        for (int i = 0; i < input.length() - 1; ++i) {
            int l = i, r = i;
            while (l >= 0 && r <input.length()) {
                if (input.charAt(l) == input.charAt(r)) {
                    l--;
                    r++;
                } else
                    break;
            }

            int len = r - l - 1;
            if (len > max) {
                max = len;
                st = l + 1;
                end = r - 1;
            }

        }

        for (int i = 0; i < input.length() - 1; ++i) {
            int l = i, r = i + 1;
            while (l >= 0 && r < input.length()) {
                if (input.charAt(l) == input.charAt(r)) {
                    l--;
                    r++;
                } else
                    break;

            }
            int len = r - l - 1;
            if (len > max) {
                max = len;
                st = l + 1;
                end = r - 1;
            }

        }

        return input.substring(st, end + 1);

    }
}
