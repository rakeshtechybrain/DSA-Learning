public class OneAway {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abde";

        System.out.println(aWay(s1, s2));
    }

    public static boolean aWay(String s1, String s2) {
        int lengDiff = Math.abs(s1.length() - s2.length());
        if (lengDiff > 1) return false;
        if (s1.length() == s2.length()) {
            return aWayStringSameeLegth(s2, s1);
        } else if (s1.length() >= s2.length()) {
            return aWayStringDiffLegth(s1, s2);
        } else {
            return aWayStringDiffLegth(s2, s1);
        }

    }

    public static boolean aWayStringSameeLegth(String s1, String s2) {

        int count = 0;

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count > 1) return false;
            }
        }
        return true;
    }

    public static boolean aWayStringDiffLegth(String s1, String s2) {
        int i = 0;
        int count = 0;
        while (i < s2.length()) {

            if (s1.charAt(i + count) == s2.charAt(i)) {
                i =i+1;
            } else {
                count ++;
                if (count > 1) return false;
            }

        }

        return true;
    }
}
