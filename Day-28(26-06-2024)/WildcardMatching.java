public class WildcardMatching {
    public boolean isMatch(String s, String p) {
        int i = 0, j = 0, starIndex = -1, match = 0;
        while (i < s.length()) {
            if (j < p.length() && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
                i++;
                j++;
            } else if (j < p.length() && p.charAt(j) == '*') {
                starIndex = j++;
                match = i;
            } else if (starIndex != -1) {
                j = starIndex + 1;
                i = ++match;
            } else return false;
        }
        while (j < p.length() && p.charAt(j) == '*') j++;
        return j == p.length();
    }

    public static void main(String[] args) {
        WildcardMatching wm = new WildcardMatching();
        System.out.println(wm.isMatch("aab", "*ab")); 
    }
}
