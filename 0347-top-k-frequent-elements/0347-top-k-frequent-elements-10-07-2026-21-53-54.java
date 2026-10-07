class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> cm = new HashMap<>();
        for (int n : nums) {
            if (!cm.containsKey(n)) {
                cm.put(n, 0);
            }
            cm.put(n, cm.get(n) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : cm.entrySet()) {
            Integer count = entry.getValue();
            Integer num = entry.getKey();
            if (bucket[count] == null) {
                bucket[count] = new ArrayList<>();
            }
            bucket[count].add(num);
        }

        int result[] = new int[k];
        int idx = 0;
        for (int i = bucket.length - 1; i > 0 && idx < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    result[idx++] = num;
                    if (idx == k) {
                        break;
                    }
                }
            }
        }
        return result;
    }
}