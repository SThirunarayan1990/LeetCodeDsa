class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder b = new StringBuilder();
        for (String word: words) {
            StringBuilder sb = new StringBuilder(word);
            b.append(sb.reverse().toString());
            b.append(" ");
        }
        return b.toString().trim();
    }

}