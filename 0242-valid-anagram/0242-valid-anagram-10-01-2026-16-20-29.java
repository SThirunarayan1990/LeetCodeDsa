class Solution {
    public boolean isAnagram(String s, String t) {
        String s1 = Stream.of(s.split(""))
                              .sorted()
                              .collect(Collectors.joining());
        String s2 = Stream.of(t.split(""))
                              .sorted()
                              .collect(Collectors.joining());
        return s1.equals(s2);
     }
}