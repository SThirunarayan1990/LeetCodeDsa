class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];

            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }

            StringBuilder key = new StringBuilder();
            for (int c : count) {
                key.append('#').append(c);
            }

            List<String> list = map.get(key.toString());

            if (list == null) {
                list = new ArrayList<>();
                map.put(key.toString(), list);
            }

            list.add(s);
        }

        return new ArrayList<>(map.values());
    }
}