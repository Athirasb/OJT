public class Solution9 {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        
        boolean firstMatch = (!s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));
        
        if (p.length() >= 2 && p.charAt(1) == '*') {
            return (isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p)));
        } else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }

    public static void main(String[] args) {
        Solution9 solution = new Solution9();
        
        System.out.println("isMatch(\"aa\", \"a\"): " + solution.isMatch("aa", "a"));
        System.out.println("isMatch(\"aa\", \"aa\"): " + solution.isMatch("aa", "aa"));
        System.out.println("isMatch(\"aaa\", \"aa\"): " + solution.isMatch("aaa", "aa"));
        System.out.println("isMatch(\"aa\", \"a*\"): " + solution.isMatch("aa", "a*"));
        System.out.println("isMatch(\"aa\", \".*\"): " + solution.isMatch("aa", ".*"));
        System.out.println("isMatch(\"ab\", \".*\"): " + solution.isMatch("ab", ".*"));
        System.out.println("isMatch(\"aab\", \"c*a*b\"): " + solution.isMatch("aab", "c*a*b"));
    }
}
