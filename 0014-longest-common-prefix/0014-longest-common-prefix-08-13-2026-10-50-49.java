class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i = 0;
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        while(i < s1.length() && i < s2.length()) {
            if(s1.charAt(i) == s2.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        return s1.substring(0, i);
    }
}