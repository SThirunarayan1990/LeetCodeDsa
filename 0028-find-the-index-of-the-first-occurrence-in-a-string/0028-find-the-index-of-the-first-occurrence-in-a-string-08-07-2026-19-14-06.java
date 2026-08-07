class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        for (int j = 0; j < haystack.length() - needle.length() + 1; j++) {
            int count = 0;
            for (int i = 0; i < needle.length(); i++) {
                if (needle.charAt(i) != haystack.charAt(j + i)) {
                    break;
                }
                count++;
            }
            if (count == needle.length()) {
                return j;
            }
        }
        return -1;
    }
}