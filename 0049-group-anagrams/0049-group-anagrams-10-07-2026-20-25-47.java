class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> m = new HashMap();
        for (String s: strs) {
            char[] sortedArray = s.toCharArray();
            Arrays.sort(sortedArray);
            String sortedString = new String(sortedArray);
            if(!m.containsKey(sortedString)) {
                m.put(sortedString, new ArrayList());
            }
            List<String> sts = m.get(sortedString);
            sts.add(s);    
        } 
        return new ArrayList(m.values());
    }
}