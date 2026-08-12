class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length()-1; i > 0; i--) {
            if(s.charAt(i-1) == ' ' && s.charAt(i) != ' ') {
                break;
            } else if (s.charAt(i) != ' '){
                length++;
            }
        }
        return length+1;
    }
}