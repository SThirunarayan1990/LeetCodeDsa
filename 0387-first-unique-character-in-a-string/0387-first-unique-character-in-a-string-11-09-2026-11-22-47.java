class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < chars.length; i++) {
            if (charMap.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}