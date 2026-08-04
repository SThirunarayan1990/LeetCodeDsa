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
        result.add("");
        for (char digit : digits.toCharArray()) {
            int index = digit - '2';
            String letters = digitToLetters[index];
            List<String> tempLetterCombo = new ArrayList();
            for (String existingLetterCombo : result) {
                for (char letter : letters.toCharArray()) {
                    tempLetterCombo.add(existingLetterCombo + letter);
                }
                result = tempLetterCombo;
            }
        }
        return result;
    }
}