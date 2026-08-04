class Solution {
    static String[] digitToLetters = new String[] {
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs", // 7
            "tuv", // 8
            "wxyz" // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList();
        backtrack(0, new StringBuilder(), digits, result);
        return result;
    }

    public void backtrack(int index, StringBuilder existingCombo, String digits, List<String> result) {
        if (index == digits.length()) {
            result.add(existingCombo.toString());
            return;
        }
        int digitIndex = digits.charAt(index) - '2';
        String letters = digitToLetters[digitIndex];
        for (char letter : letters.toCharArray()) {
            existingCombo.append(letter);
            backtrack(index + 1, existingCombo, digits, result);
            existingCombo.deleteCharAt(existingCombo.length() - 1);
        }
    }
}