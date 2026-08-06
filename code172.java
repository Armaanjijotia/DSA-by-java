class Solution {
    public int trailingZeroes(int n) {

        int count = 0;

        while (n >= 5) {
            n = n / 5;   // Count multiples of 5, 25, 125...
            count = count + n;
        }

        return count;
    }
}