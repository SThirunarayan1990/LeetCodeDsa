class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {

            switch (c) {
                case '(' -> st.push(')');
                case '{' -> st.push('}');
                case '[' -> st.push(']');
                default -> {
                    if (st.isEmpty() || c != st.pop()) {
                        return false;
                    }
                }
            }
        }

        return st.isEmpty();
    }
}