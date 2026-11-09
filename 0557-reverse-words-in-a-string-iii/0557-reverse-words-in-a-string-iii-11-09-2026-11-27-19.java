class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder b = new StringBuilder();
        for (int ind = 0; ind < words.length; ind++) {
            char[] c = words[ind].toCharArray();
            int i = 0, j = c.length-1;
            while (i < j) {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
            b.append(String.valueOf(c));
            b.append(" ");
        }
        return b.toString().trim();
    }
}