class Solution {
    public String reverseWords(String s) {

        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == ' ' || i == 0) {

                if (i == 0 && s.charAt(i) != ' ') {
                    word.append(s.charAt(i));
                }

                if (word.length() > 0) {
                    result.append(word.reverse()).append(" ");
                    word.setLength(0);
                }

            } else {
                word.append(s.charAt(i));
            }
        }
        return result.toString().trim();
    }
}