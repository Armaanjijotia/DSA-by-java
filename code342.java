class Solution {
    public boolean isPowerOfFour(int n) {
        
        // Must be positive
        if (n <= 0) {
            return false;
        }

        // Check power of 2
        if ((n & (n - 1)) != 0) {
            return false;
        }

        // Check if set bit is at even position
        return (n & 0x55555555) != 0;
    }
}