class Solution {
    public int minCut(String s) {
        int n = s.length();
        
        // Step 1: Palindrome table
        boolean[][] isPal = new boolean[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (s.charAt(i) == s.charAt(j) &&
                   (i - j <= 2 || isPal[j + 1][i - 1])) {
                    isPal[j][i] = true;
                }
            }
        }
        
        // Step 2: DP for minimum cuts
        int[] dp = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (isPal[0][i]) {
                dp[i] = 0;
            } else {
                dp[i] = Integer.MAX_VALUE;
                
                for (int j = 0; j < i; j++) {
                    if (isPal[j + 1][i]) {
                        dp[i] = Math.min(dp[i], dp[j] + 1);
                    }
                }
            }
        }
        
        return dp[n - 1];
    }
}