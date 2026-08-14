class Solution {
    public char findTheDifference(String s, String t) {
        int[] ch = new int[26];

        for (char c : s.toCharArray()) {
            ch[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            ch[c - 'a']--;
            if (ch[c - 'a'] < 0) {
                return c;
            }
        }
        return 'a';
    }
}