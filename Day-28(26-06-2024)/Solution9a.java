public class Solution9a {
    public boolean isMatch(String s, String p) {
        if (p.length() == 0)
            return s.length() == 0;
        
        // p’s length 1 is a special case
        if (p.length() == 1 || p.charAt(1) != '*') {
            if (s.length() < 1 || (p.charAt(0) != '.' && s.charAt(0) != p.charAt(0)))
                return false;
            return isMatch(s.substring(1), p.substring(1));
        } else {
            int len = s.length();
            int i = -1;
            while (i < len && (i < 0 || p.charAt(0) == '.' || p.charAt(0) == s.charAt(i))) {
                if (isMatch(s.substring(i + 1), p.substring(2)))
                    return true;
                i++;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution9a solution = new Solution9a();

        System.out.println("isMatch(\"aa\", \"a\"): " + solution.isMatch("aa", "a"));
        System.out.println("isMatch(\"aa\", \"aa\"): " + solution.isMatch("aa", "aa"));
        System.out.println("isMatch(\"aaa\", \"aa\"): " + solution.isMatch("aaa", "aa"));
        System.out.println("isMatch(\"aa\", \"a*\"): " + solution.isMatch("aa", "a*"));
        System.out.println("isMatch(\"aa\", \".*\"): " + solution.isMatch("aa", ".*"));
        System.out.println("isMatch(\"ab\", \".*\"): " + solution.isMatch("ab", ".*"));
        System.out.println("isMatch(\"aab\", \"c*a*b\"): " + solution.isMatch("aab", "c*a*b"));
    }
}
