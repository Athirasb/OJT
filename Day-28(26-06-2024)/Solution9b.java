public class Solution9b {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        
        // Check if the second char of p is '*'
        if (p.length() > 1 && p.charAt(1) == '*') {
            // Case 2: when the second char of p is '*', complex case.
            return isMatch(s, p.substring(2)) || (!s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.') && isMatch(s.substring(1), p));
        } else {
            // Base case & Special case: when the second char of p is not '*'
            return !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.') && isMatch(s.substring(1), p.substring(1));
        }
    }

    public static void main(String[] args) {
        Solution9b solution = new Solution9b();

        System.out.println("isMatch(\"aa\", \"a\"): " + solution.isMatch("aa", "a"));
        System.out.println("isMatch(\"aa\", \"aa\"): " + solution.isMatch("aa", "aa"));
        System.out.println("isMatch(\"aaa\", \"aa\"): " + solution.isMatch("aaa", "aa"));
        System.out.println("isMatch(\"aa\", \"a*\"): " + solution.isMatch("aa", "a*"));
        System.out.println("isMatch(\"aa\", \".*\"): " + solution.isMatch("aa", ".*"));
        System.out.println("isMatch(\"ab\", \".*\"): " + solution.isMatch("ab", ".*"));
        System.out.println("isMatch(\"aab\", \"c*a*b\"): " + solution.isMatch("aab", "c*a*b"));
    }
}
