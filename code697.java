import java.util.*;

class Solution {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        // Store frequency, first index, and last index
        for (int i = 0; i < nums.length; i++) {

            if (!first.containsKey(nums[i])) {
                first.put(nums[i], i);
            }

            last.put(nums[i], i);
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        // Find degree of the array
        int degree = 0;
        for (int count : freq.values()) {
            degree = Math.max(degree, count);
        }

        // Find the minimum length subarray
        int ans = nums.length;

        for (int key : freq.keySet()) {
            if (freq.get(key) == degree) {
                int length = last.get(key) - first.get(key) + 1;
                ans = Math.min(ans, length);
            }
        }

        return ans;
    }
}