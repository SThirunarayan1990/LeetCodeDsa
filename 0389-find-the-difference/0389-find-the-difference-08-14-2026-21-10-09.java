class Solution {
    public char findTheDifference(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        int i = 0;
        while (i < sChars.length && sChars[i] == tChars[i]) {
            i++;
        }
        return tChars[i];
    }
}