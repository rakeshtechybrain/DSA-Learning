public class LongestCommonPrefixLeetCode14 {


    public static void main(String[] args) {

        String[] str = {"geeksforgeeks","geeks","geek","geezer"};
        System.out.println(longestCommonPrefix(str));
    }

    private static String longestCommonPrefix(String[] str) {
        String longestCommonPrefix = "";
        int index = 0;
        if (str == null || str.length == 0)
            return longestCommonPrefix;

        for (char c : str[0].toCharArray()) {

            for (int i = 1; i < str.length; i++) {

                if (index >= str[i].length() || c != str[i].charAt(index)) {
                    return longestCommonPrefix;
                }

            }
            longestCommonPrefix += c;
            index++;

        }


        return longestCommonPrefix;
    }
}
