class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        int maxLength = 0;
        for (String t : wordDict) {
            maxLength = Math.max(maxLength, t.length());
        }

        for (int i = 1; i <= n; i++) {
            dp[i] = false;
            for (int j = i - 1; j >= Math.max(0, i - maxLength) && !dp[i]; j--) {
                if (dp[j]) {
                    if (wordDict.contains(s.substring(j, i))) {
                        dp[i] = true;
                    }
                }
            }

        }

        return dp[n];

    }
}