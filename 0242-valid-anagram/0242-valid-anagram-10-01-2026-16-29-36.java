class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int indx[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            indx[s.charAt(i) - 'a']++;
            indx[t.charAt(i) - 'a']--;
        }
        for (int c : indx) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }
}