public class Solution {
    public int findNthDigit(int n) {
        long digits = 1;   // number of digits in current block
        long count = 9;    // count of numbers in current block
        long start = 1;    // first number in current block

        // Find the block containing the nth digit
        while (n > digits * count) {
            n -= digits * count;
            digits++;
            count *= 10;
            start *= 10;
        }

        // Find the actual number
        long num = start + (n - 1) / digits;

        // Find the digit within that number
        String s = Long.toString(num);
        return s.charAt((int)((n - 1) % digits)) - '0';
    }
} {
    
}
