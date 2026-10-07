class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int n: nums) {
            if(!counts.containsKey(n)) {
                counts.put(n, 0);
            }
            counts.put(n, counts.get(n)+1);
        }
        boolean hasDup = false;
        for (int n: counts.values()) {
            if(n > 1) {
                hasDup = true;
            } 
        }
        return hasDup;
    }
}