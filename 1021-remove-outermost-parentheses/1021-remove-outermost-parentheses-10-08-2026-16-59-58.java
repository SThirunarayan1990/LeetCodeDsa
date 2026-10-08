class Solution {
    public String removeOuterParentheses(String s1) {
        Stack<String> s = new Stack();
        StringBuilder b = new StringBuilder();
        for (char c : s1.toCharArray()) {
            String sc = c + "";
            if (c == '(') {
                if (!s.isEmpty()) {
                    b.append(sc);
                }
                s.push(sc);
            } else {
                s.pop();
                if (!s.isEmpty()) {
                    b.append(sc);
                }
            }
        }
        return b.toString();
    }
}