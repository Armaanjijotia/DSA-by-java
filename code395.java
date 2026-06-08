class Solution {
    public int longestSubstring(String s, int k) {
        return helper(s, 0, s.length(), k);
    }

    private int helper(String s, int start, int end, int k) {
        // If substring length is smaller than k, impossible
        if (end - start < k) {
            return 0;
        }

        int[] freq = new int[26];

        // Count frequency
        for (int i = start; i < end; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Find invalid character
        for (int mid = start; mid < end; mid++) {
            if (freq[s.charAt(mid) - 'a'] < k) {

                int midNext = mid + 1;

                // Skip consecutive invalid characters
                while (midNext < end &&
                       freq[s.charAt(midNext) - 'a'] < k) {
                    midNext++;
                }

                int left = helper(s, start, mid, k);
                int right = helper(s, midNext, end, k);

                return Math.max(left, right);
            }
        }

        // Entire substring is valid
        return end - start;
    }
}