class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String> wordSet = new HashSet<>(wordDict);

        int n = s.length();

        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        int maxLength = 0;

        for (String word : wordDict) {
            maxLength = Math.max(maxLength, word.length());
        }

        for (int i = 1; i <= n; i++) {

            for (int j = Math.max(0, i - maxLength); j < i; j++) {

                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}