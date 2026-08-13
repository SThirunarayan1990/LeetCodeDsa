class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {

            // 1. Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) {
                break;
            }

            // 2. Remember end of the word
            int end = i;

            // 3. Move backwards until we find a space
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // 4. Add space between words
            if (result.length() > 0) {
                result.append(' ');
            }

            // 5. Add the word
            result.append(s, i + 1, end + 1);
        }

        return result.toString();
    }
}