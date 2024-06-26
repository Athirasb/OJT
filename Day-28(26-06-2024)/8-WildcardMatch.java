public class WildcardMatch {
    
    public boolean isMatch(String s, String p) {
        int sIndex = 0, pIndex = 0, lastSIndex = 0, lastPIndex = -1;
        
        while (sIndex < s.length()) {
            if (pIndex < p.length() && (p.charAt(pIndex) == '?' || p.charAt(pIndex) == s.charAt(sIndex))) {
                sIndex++;
                pIndex++;
            } else if (pIndex < p.length() && p.charAt(pIndex) == '*') {
                lastPIndex = pIndex++;
                lastSIndex = sIndex;
            } else if (lastPIndex != -1) {
                pIndex = lastPIndex + 1;
                sIndex = ++lastSIndex;
            } else {
                return false;
            }
        }
        
        while (pIndex < p.length() && p.charAt(pIndex) == '*') pIndex++;
        return pIndex == p.length();
    }

    public static void main(String[] args) {
        WildcardMatching wm = new WildcardMatching();
        System.out.println(wm.isMatch("adceb", "*a*b")); 
        System.out.println(wm.isMatch("acdcb", "a*c?b")); 
    }
}
